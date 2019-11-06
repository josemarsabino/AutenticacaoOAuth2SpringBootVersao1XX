package br.com.sada.autenticacaooauth2versaospringboot1.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public String testeApiCategoria() {
		return "Api Rest Categoria funcionando com Autenticação Básica";
	}

}
