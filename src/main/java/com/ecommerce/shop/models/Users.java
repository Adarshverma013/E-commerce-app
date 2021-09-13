package com.ecommerce.shop.models;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",nullable = false,length = 100)
    private String userName;

    @Column(name = "email",nullable = false,length = 100)
    private String email;

    @Column(name = "password",nullable = false,length = 100)
    private String password;

    @Column(name = "role",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Column(name = "address",nullable = false)
    private String address;

    @Column(name = "contact",nullable = false)
    private String contact;

    @Column(name = "image",nullable = false)
    private String image;

    @Column(name = "name",length = 1)
    private String gender;

    public Users() {
    }

    public Users(String name, String email, String password, Role role, String address, String contact, String image, String gender) {
        this.userName = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.contact = contact;
        this.image = image;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
