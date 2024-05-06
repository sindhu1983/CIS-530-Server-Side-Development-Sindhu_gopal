@configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true)

public class SecurityConfig WebSecurityConfigurerAdapter{

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {}

    PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    auth 
        .inMemoryAuthetication();
        .withUser("user").passworf(encoder.encode("password")).roles("USER")
        .and()
        .withUser("testuser01").password(encoder.encode("password01")).roles("User","Admin");

    http
        .authorizeRequest()
            .anyRequest().Authenticated()
            .and()
        .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
        .logout()
            .logoutSuccessUrl("/login?logout=true")
            .invalidateHttpSession(true)
            .permitAll();


}




