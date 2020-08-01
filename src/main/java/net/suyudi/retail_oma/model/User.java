package net.suyudi.retail_oma.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class User {

    private Long id;

    private Object role;

    private String username;

    private String mobile;

}
