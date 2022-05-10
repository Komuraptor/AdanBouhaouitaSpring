package compraventa.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import compraventa.constantes.Constantes;
import compraventa.model.ArticulosModel;
import compraventa.model.CuentaModel;
import compraventa.service.ArticulosService;
import compraventa.service.CuentaService;

@Controller
@RequestMapping("/gestionproductos")
public class ArticulosController {
	
	@Autowired
	@Qualifier("articulosServiceImpl")
	private ArticulosService articulosService;
	
	@Autowired
	@Qualifier("cuentaServiceImpl")
	private CuentaService cuentaService;
	
	@GetMapping("/articulos")
	public ModelAndView listaArticulos() {
		ModelAndView mav = new ModelAndView(Constantes.ARTICULOS_VIEW);
		mav.addObject("articulos", articulosService.listarArticulos());
		return mav;
	}
	
	@PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("/addArticulo")
	public String redirectAddArticulo(@RequestParam(name = "id") int id, Model model) {
		ArticulosModel articulosModel = new ArticulosModel();
		if(id != -1) {
			List<ArticulosModel> list = articulosService.listarArticulos();
			for (ArticulosModel am : list) {
				if (am.getId() == id) {
					articulosModel = am;
				}
			}
		}
		model.addAttribute("articulo", articulosModel);
		model.addAttribute("cuenta", cuentaService.listarCuentas());
		return Constantes.ADD_ARTICULO;
	}
	
	@PreAuthorize("hasRole('ROLE_USER')")
	@PostMapping("/addArticulo")
	public ModelAndView addArticulo(@RequestParam(name = "email") String email,
			@RequestParam("imagen") MultipartFile foto,
			@Valid @ModelAttribute("articulo") ArticulosModel articulosModel,
			BindingResult result,
			Model model) {
		
		ModelAndView mav = new ModelAndView();
		
		CuentaModel cuentaModel = new CuentaModel();
		List<CuentaModel> list = cuentaService.listarCuentas();
		for(CuentaModel cm : list) {
			if(cm.getEmail().equals(email)) {
				cuentaModel = cm;
			}
		}
		
		if(result.hasErrors()) {
			mav.setViewName(Constantes.ADD_ARTICULO);
			model.addAttribute("cuentas", cuentaService.listarCuentas());
		} else {
			if(!foto.isEmpty()) {
				Path dir = Paths.get(".\\src\\main\\resources\\static\\imagenes\\articulos");
				String rootPath = dir.toFile().getAbsolutePath();
				try {
					byte[] bytes = foto.getBytes();
					Path fullPath = Paths.get(rootPath + "\\" + articulosModel.getNombre() + ".png");
					Files.write(fullPath, bytes);
					articulosModel.setImagen("/imagenes/articulos/" + articulosModel.getNombre() + ".png");
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			articulosModel.setId_usuario(cuentaModel);
			articulosService.añadirArticulo(articulosModel);
			mav.setViewName("redirect:/gestionproductos/articulos");
		}
		
		return mav;
	}
	
	@PostMapping("/removeArticulo")
	public String removeArticulo(@RequestParam(name="id") int id) {
		articulosService.eliminarArticulo(id);
		return "redirect:/gestionproductos/articulos";
	}

}
