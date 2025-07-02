package com.jocata.los.authservice.controller;

import com.jocata.los.authservice.service.AuthService;
import com.jocata.los.datamodel.auth.form.AuthRequest;
import com.jocata.los.datamodel.auth.form.AuthResponse;
import com.jocata.los.datamodel.user.form.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthController {

    @Autowired
    private AuthService authService;

    public String register(@RequestBody UserProfile user) {
        return authService.register(user);
    }

    public AuthResponse login(@RequestBody AuthRequest request) {
        return authService.login(request);
    }
}
