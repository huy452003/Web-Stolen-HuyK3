package com.webhuyk3.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users_roles")
public class User_Role {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "roleId", referencedColumnName = "id")
    private Role role;


    public User_Role(Long id, User user, Role role) {
        this.id = id;
        this.user = user;
        this.role = role;
    }

    public User_Role() {
    }

    public Long getId() {
        return this.id;
    }

    public User getUser() {
        return this.user;
    }

    public Role getRole() {
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
