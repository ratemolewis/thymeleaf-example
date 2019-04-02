package com.zalego.io.demo.entities;

import com.zalego.io.demo.configs.Encrypt;

import javax.persistence.*;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
public class Users extends BaseEntity{
    @Column(name= "name")
    private String name;
    @Column(name= "email")
    private String email;
    @Column(name="phone")
    private BigInteger phone;
    @Column(name="password")
    private String password;


    public Users() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        this.password = new Encrypt().EncryptPassword(password);
    }
}
