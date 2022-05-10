package compraventa.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import compraventa.constantes.Constantes;


@Controller
@RequestMapping("/gestionproductos")
public class InicioController {
	
	@GetMapping("/inicio")
	public ModelAndView inicio() {
		ModelAndView mav = new ModelAndView(Constantes.INICIO_VIEW);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		mav.addObject("email",user.getUsername());
		return mav;
	}
}
