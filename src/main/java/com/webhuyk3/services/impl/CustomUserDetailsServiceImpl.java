package com.webhuyk3.services.impl;

import com.webhuyk3.models.CustomUserDetails;
import com.webhuyk3.models.User;
import com.webhuyk3.models.User_Role;
import com.webhuyk3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUserName(username);
        if (user == null){
            throw new UsernameNotFoundException("Wrong username");
        }
        Collection<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
        Set<User_Role> roles = user.getUserRoles();

        for (User_Role role : roles) {
            grantedAuthoritySet.add(new SimpleGrantedAuthority(role.getRole().getName()));
        }
        return new CustomUserDetails(user, grantedAuthoritySet);
    }
}
