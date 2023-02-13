package br.com.apidenuncia.apidenuncia;

import br.com.apidenuncia.apidenuncia.DTOs.endereco.EnderecoClientDTO;
import br.com.apidenuncia.apidenuncia.domain.Data;
import br.com.apidenuncia.apidenuncia.proxy.EnderecoClient;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApidenunciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidenunciaApplication.class, args);
	}

}
