package net.suyudi.retail_oma.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import net.suyudi.retail_oma.model.User;

import java.util.Map;

public class UmaPrincipalExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        User user = new User();

        user.setId(Long.parseLong(map.get("id").toString()));
        user.setRole(map.get("role"));
        user.setUsername(map.get("username").toString());
        user.setMobile(map.get("mobile").toString());

        return user;
    }

}
