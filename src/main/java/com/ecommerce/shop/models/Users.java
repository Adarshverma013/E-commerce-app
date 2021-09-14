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

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Column(name = "address")
    private String address;

    @Column(name = "contact",nullable = false)
    private String contact;

    @Column(name = "image")
    private String image;

    @Column(name = "gender",length = 1)
    private String gender;

    public Users() {
    }

    public Users(String userName, String email, String password, Role role, String address, String contact, String image, String gender) {
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
