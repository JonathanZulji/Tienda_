
package com.tienda;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
 @Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigureAdapter{
    
auth.inMemoryAuthentication()
        .withUser("juan")
        .password("{noop}123")
        .roles("ADMIN","VENDEDOR","USER")
        .and()
        .withUser("rebeca")
        .password("{noop}456")
        .roles("VENDEDOR","USER")
        .and()
        .withUser("pedro")
        .password("{noop}789")
        .roles("USER");
}
