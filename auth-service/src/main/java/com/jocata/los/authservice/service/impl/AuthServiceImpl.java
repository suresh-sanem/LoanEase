package com.jocata.los.authservice.service.impl;

import com.jocata.los.authservice.service.AuthService;
import com.jocata.los.common.util.JwtUtil;
import com.jocata.los.datamodel.auth.form.AuthRequest;
import com.jocata.los.datamodel.auth.form.AuthResponse;
import com.jocata.los.datamodel.user.form.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public String register(UserProfile user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return "User registered successfully";
    }

    @Override
    public AuthResponse login(AuthRequest request) {

        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails userDetails = new User(request.getUsername(), request.getPassword(), new java.util.ArrayList<>());
        String token = jwtUtil.generateToken(userDetails);
        return new AuthResponse(token);
    }
}
