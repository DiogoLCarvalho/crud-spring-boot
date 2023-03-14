package com.fatec.sig1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Objetivo - essa classe recebe as requisições do cliente e retorna a view
 * @Controller - Diz q é uma classe q recebe as requisições WEB
 * @GetMapping - Define a rota da URL, se chamar o "/" retorna a página HTML, se chama /cliente chama outra página HTML
 * menu() - O método menu( ) está anotado com @GetMapping para indicar que, se uma solicitação HTTP GET for
recebida para o caminho “localhost:8080 /, esse método é chamado e deve retornar o nome lógico de uma visualização, neste
exemplo uma página HTML localizada no folder "templates/"
* em target shapshot.jar pode rodar a sua aplicação em qualquer lugar
 */

@Controller
public class GUIMenuController {
	
	/**
	 * processa a requisicao localhost:8080/
	 * 
	 * @return a view html
	 */
	
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}

	/**
	 * processa a requisicao localhost:8080/clientes
	 * 
	 * @return a view html
	 */
	
	@GetMapping("/clientes")
	public ModelAndView formCliente() {
		return new ModelAndView("cadastrarCliente");
	}
}

