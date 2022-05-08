package compraventa.crypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Crypt {

	public String generaPass(String password) {
		BCryptPasswordEncoder pe=new BCryptPasswordEncoder();
		System.out.println(pe.encode(password));
		return pe.encode(password);
	}
}
