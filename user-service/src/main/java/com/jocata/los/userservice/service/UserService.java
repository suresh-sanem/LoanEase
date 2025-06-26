package com.jocata.los.userservice.service;

import com.jocata.los.datamodel.user.form.UserProfile;

import java.util.List;

public interface UserService {

    public UserProfile saveUser(UserProfile userProfile);

    public UserProfile getUserById(Long id);

    public List<UserProfile> getAllUsers();

    public UserProfile updateUser(Long id, UserProfile updatedUser);

    public void deleteUser(Long id);
}
