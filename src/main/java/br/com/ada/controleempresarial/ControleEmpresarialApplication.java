package br.com.ada.controleempresarial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ControleEmpresarialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleEmpresarialApplication.class, args);
	}

	/*@RequestMapping("/v1/hello-world")
	@ResponseBody
	String home() {
		return "Hello World, Hugo!";
	}
	 */

}
