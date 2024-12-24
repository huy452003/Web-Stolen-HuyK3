package com.webhuyk3.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role")
    private Set<User_Role> roleUsers;


    public Role(Long id, String name, Set<User_Role> roleUsers) {
        this.id = id;
        this.name = name;
        this.roleUsers = roleUsers;
    }

    public Role() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Set<User_Role> getRoleUsers() {
        return this.roleUsers;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoleUsers(Set<User_Role> roleUsers) {
        this.roleUsers = roleUsers;
    }
}
