package compraventa.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import compraventa.service.impl.CuentaServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	@Qualifier("cuentaServiceImpl")
	private CuentaServiceImpl cuentaServiceImpl;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(cuentaServiceImpl).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/css/*", "/imagenes/*", "/pdf/*", "/gestionproductos/registro", "/gestionproductos/addCuenta")
		.permitAll().anyRequest().authenticated().and()
		.formLogin().loginPage("/gestionproductos/login")
		.loginProcessingUrl("/logincheck").usernameParameter("email")
		.passwordParameter("password").defaultSuccessUrl("/gestionproductos/loginsuccess").
		permitAll().and().logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout").permitAll();
	}

}
