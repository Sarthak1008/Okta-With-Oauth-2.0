## Overview
This project demonstrates the integration of Okta authentication and authorization with OAuth 2.0 in a Spring Boot application. Okta is used as an identity provider to manage user authentication and access control.

## Features
- User authentication using Okta
- OAuth 2.0 authorization flow
- Securing endpoints based on user roles
- Spring Security integration for authentication and authorization

## Prerequisites
- Java Development Kit (JDK) installed
- Maven installed
- Okta developer account (https://developer.okta.com/signup/)
- Spring Boot application setup

## Dependencies
- Spring Boot Starter Web
- Spring Boot Starter Security
- Okta Spring Boot Starter

## Configuration Steps

### 1. Okta Setup
- Sign up for a developer account on Okta.
- Create a new Okta application.
- Note down the client ID, client secret, and issuer URL provided by Okta.

### 2. Spring Boot Configuration
- Add the Okta Spring Boot Starter dependency to your `pom.xml` file.
- Configure application properties:
  ```properties
  # Okta configuration
  okta.oauth2.client-id=<your-client-id>
  okta.oauth2.client-secret=<your-client-secret>
  okta.oauth2.issuer=<your-issuer-url>

### 3. Security Configuration
- Create a security configuration class to customize Spring Security settings.
- Configure OAuth 2.0 authentication:
 
```java
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/public").permitAll()
                .anyRequest().authenticated()
                .and()
            .oauth2Login();
    }
}
