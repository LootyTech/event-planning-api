package com.looty.eventplanningapi.config;

import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.List;

/**
 * Jwt audience validator
 *
 * @author stever410 (ngotanduc410@gmail.com)
 * @since 7/21/23
 */
@AllArgsConstructor
public class AudienceValidator implements OAuth2TokenValidator<Jwt> {
    private final List<String> audiences;

    public OAuth2TokenValidatorResult validate(Jwt jwt) {
        OAuth2Error error = new OAuth2Error("invalid_token", "The required audience is missing", null);
        for (String audience : audiences) {
            if (jwt.getAudience().contains(audience)) return OAuth2TokenValidatorResult.success();
        }
        return OAuth2TokenValidatorResult.failure(error);
    }
}
