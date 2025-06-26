package com.jocata.los.userservice.controller;

import com.jocata.los.datamodel.user.form.UserProfile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UserController {

    public UserProfile createProfile(@RequestBody UserProfile userProfile){
        return null;
    }

    public UserProfile getUserById(@PathVariable Long id){
        return null;
    }

    public List<UserProfile> getAllUsers(){
        return null;
    }

    public UserProfile updateUser(@PathVariable Long id, @RequestBody UserProfile updatedUser){
        return null;
    }

    public String deleteUser(@PathVariable Long id){
        return null;
    }
}
