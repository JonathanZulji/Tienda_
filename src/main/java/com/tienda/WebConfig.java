
package com.tienda;

import org.springframework.boot.autoconfigure.web.WebProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Bean
    
    public LocaleResolver localeResolver(){
            var slr = new SessionLocalResolver();
            slr.setDefaultLocale(new Locale("es"));
            return slr;
            
    }
    
     public LocaleResolver localeResolver(){
            var lci = new SessionLocalResolver();
            lci.setDefaultLocale(new Locale("es"));
            return lci;
            
    }
     @Override
     puclic void addInterceptors(InterceptorRegistry registro){
         registro.addInterceptor(localeChangeIntercetor());
         
     }
}
