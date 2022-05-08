package compraventa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import compraventa.constantes.Constantes;
import compraventa.crypt.Crypt;
import compraventa.model.CuentaModel;
import compraventa.service.CuentaService;
import compraventa.service.RolUsuarioService;

@Controller
@RequestMapping("/gestionproductos")
public class RegistroController {

	@Autowired
	@Qualifier("cuentaServiceImpl")
	private CuentaService cuentaService;
	
	@Autowired
	@Qualifier("rolUsuarioServiceImpl")
	private RolUsuarioService rolUsuarioService;
	
	private Crypt crypt = new Crypt();
	
	@GetMapping("/registro")
	public String registrar(Model model) {
		CuentaModel cuentaModel = new CuentaModel();
		model.addAttribute("cuenta", cuentaModel);
		return Constantes.REGISTRO_VIEW;
	}
	
	@PostMapping("/addCuenta")
	public ModelAndView addCuenta(@ModelAttribute("cuenta") CuentaModel cuentaModel, Model model, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Registro");
		if(result.hasErrors() || cuentaService.compruebaCuenta(cuentaModel.getEmail())) {
			
			if(cuentaService.compruebaCuenta(cuentaModel.getEmail())) {
				model.addAttribute("error", 1);
			}
			mav.setViewName(Constantes.REGISTRO_VIEW);
			System.out.println("No registrado");
		} else {
			String pass_crypt = crypt.generaPass(cuentaModel.getPassword());
			cuentaModel.setPassword(pass_crypt);
			cuentaModel.setEnabled(true);
			cuentaService.save(cuentaModel);
			mav.setViewName("redirect://gestionproductos/login");
			System.out.println("Registrado");
		}
		return mav;
	}
	
}
