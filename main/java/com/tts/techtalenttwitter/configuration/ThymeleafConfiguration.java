package com.tts.techtalenttwitter.configuration;

@Configuration
    public class ThymeleafConfiguration {
        @Bean
        public SpringSecurityDialect springSecurityDialect(){
            return new SpringSecurityDialect();
        }
    }

