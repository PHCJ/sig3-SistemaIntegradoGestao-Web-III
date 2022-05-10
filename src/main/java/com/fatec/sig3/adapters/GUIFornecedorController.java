package com.fatec.sig3.adapters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/sig")
public class GUIFornecedorController {
	Logger logger = LogManager.getLogger(GUIClienteController.class);
	@GetMapping("/fornecedores")
	public ModelAndView retornaPaginaFornecedor() {
		ModelAndView modelAndView = new ModelAndView("cadastrarFornecedores");
		return modelAndView;
	}
}
