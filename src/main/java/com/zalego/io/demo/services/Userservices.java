package com.zalego.io.demo.services;

import com.zalego.io.demo.Repo.UserRepo;
import com.zalego.io.demo.configs.Reset;
import com.zalego.io.demo.entities.Users;
import com.zalego.io.demo.exceptions.AuthorisedAccess;
import com.zalego.io.demo.exceptions.UnAuthorisedAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class Userservices {
@Autowired
    private UserRepo UserRepo;
public List<Users> findAllUsers(){
    return UserRepo.findAll();
}
public Users inseertUser(Users users){
    UserRepo.save(users);
    Users[] user = {new Users()};
    UserRepo.findByEmailAndPassword(users.getEmail(),users.getPassword()).ifPresent(users1 -> {
        user[0] =users1;
    });
    return user[0];
}
public Users authorizeUser(Users users){
    Users[] user = {new Users()};
    UserRepo.findByEmailAndPassword(users.getEmail(),users.getPassword()).ifPresent(
            users1 -> {
                user[0]= users1;
            }
    );
    if(user[0].getEmail()==null)
        throw new UnAuthorisedAccess();
    else
        return user[0];
}
    public Users resetUser(Reset reset){
        Users[] user = {new Users()};
        System.out.println(reset.getPassword());
        UserRepo.findByEmail(reset.getEmail()).ifPresent(users1 -> {
            try {
                System.out.println(reset.getPassword());
                users1.setPassword(reset.getPassword());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            user[0]=UserRepo.save(users1);
        });
        return user[0];
    }
}
