package compraventa.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import compraventa.entity.Cuenta;
import compraventa.entity.RolUsuario;
import compraventa.model.CuentaModel;
import compraventa.repository.CuentaRepository;
import compraventa.repository.RolUsuarioRepository;
import compraventa.service.CuentaService;

@Service("cuentaServiceImpl")
public class CuentaServiceImpl implements UserDetailsService, CuentaService {
	
	@Autowired
	@Qualifier("cuentaRepository")
	private CuentaRepository cuentaRepository;
	
	@Autowired
	@Qualifier("rolUsuarioRepository")
	private RolUsuarioRepository rolUsuarioRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public List<CuentaModel> listarCuentas() {
		List<Cuenta> listaC = cuentaRepository.findAll();
		List<CuentaModel> listaCM = new ArrayList<>();
		listaC.forEach(c->{
			CuentaModel cuentaModel = transform(c);
			listaCM.add(cuentaModel);
		});
		
		Collections.sort(listaCM, (CuentaModel c1, CuentaModel c2) -> c1.getEmail().compareTo(c2.getEmail()));
		
		return listaCM;
	}

	@Override
	public CuentaModel añadirCuenta(CuentaModel cuentaModel) {
		Cuenta cuenta = transform(cuentaModel);
		return transform(cuentaRepository.save(cuenta));
	}

	@Override
	public boolean compruebaCuenta(String email) {
		boolean existe = false;
		List<CuentaModel> listC = listarCuentas();
		
		for(CuentaModel cm: listC) {
			System.out.println(cm.getEmail());
			if(cm.getEmail().equals(email)) {
				System.out.println("Coinciden");
				existe = true;
			}
		}
		return existe;
	}

	
	public void save(CuentaModel cuentaModel) {
		Date fech_alta = new Date();
		Cuenta cuenta = new Cuenta();
		cuenta.setEmail(cuentaModel.getEmail());
		cuenta.setPassword(cuentaModel.getPassword());
		cuenta.setListaRoles(new HashSet<>(rolUsuarioRepository.findAll()));
		cuenta.setEnabled(true);
		
		cuenta.setDni(cuentaModel.getDni());
		cuenta.setNombre(cuentaModel.getNombre());
		cuenta.setApellidos(cuentaModel.getApellidos());
		cuenta.setFech_nac(cuentaModel.getFech_nac());
		cuenta.setFech_alta(fech_alta);
		cuenta.setTelefono(cuentaModel.getTelefono());
		cuenta.setSaldo(0);
		cuentaRepository.save(cuenta);
		
		RolUsuario rol = new RolUsuario();
		rol.setRol(cuentaModel.getRol());
		rol.setCuenta(cuenta);
		rolUsuarioRepository.save(rol);
	}

	@Override
	public Cuenta transform(CuentaModel cuentaModel) {
		return dozer.map(cuentaModel, Cuenta.class);
	}

	@Override
	public CuentaModel transform(Cuenta cuenta) {
		return dozer.map(cuenta, CuentaModel.class);
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Cuenta cuenta = cuentaRepository.findByEmail(email);
		List<GrantedAuthority> authorities = buildAuthorities(cuenta.getListaRoles());
		return buildUser(cuenta, authorities);
	}
	
	private List<GrantedAuthority> buildAuthorities(Set<RolUsuario> listaRoles) {
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		
		for(RolUsuario rolUsuario: listaRoles) {
			auths.add(new SimpleGrantedAuthority(rolUsuario.getRol()));
		}
		
		return new ArrayList<GrantedAuthority>(auths);
	}
	
	private User buildUser(Cuenta cuenta, List<GrantedAuthority> authorities) {
		return new User(cuenta.getEmail(), cuenta.getPassword(), cuenta.isEnabled(), true, true, true, authorities);
	}

}
