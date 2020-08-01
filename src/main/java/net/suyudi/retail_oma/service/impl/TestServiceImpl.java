package net.suyudi.retail_oma.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import net.suyudi.retail_oma.model.User;
import net.suyudi.retail_oma.service.TestService;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getAccessRemote() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User userSession = (User) auth.getPrincipal();

        System.out.println(userSession);
        
        return userSession.toString();
    }

}