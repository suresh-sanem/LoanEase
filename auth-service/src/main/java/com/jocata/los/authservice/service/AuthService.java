package com.jocata.los.authservice.service;

import com.jocata.los.datamodel.auth.form.AuthRequest;
import com.jocata.los.datamodel.auth.form.AuthResponse;
import com.jocata.los.datamodel.user.form.UserProfile;

public interface AuthService {

    public String register(UserProfile user);

    public AuthResponse login(AuthRequest request);
}

