package com.cmpe133.spacewiki.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class AuthenticationResponse {
    private String authenticationToken;
    private String username;
}
