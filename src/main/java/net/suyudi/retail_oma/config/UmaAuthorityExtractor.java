package net.suyudi.retail_oma.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UmaAuthorityExtractor implements AuthoritiesExtractor {

    @Override
    public List<GrantedAuthority> extractAuthorities (Map<String, Object> map) {
        return AuthorityUtils.commaSeparatedStringToAuthorityList(asAuthorities(map));
    }

    private String asAuthorities(Map<String, Object> map) {
        List<String> authorities = new ArrayList<>();

        authorities.add(map.get("role").toString());
        
        return String.join(",", authorities);
    }

}
