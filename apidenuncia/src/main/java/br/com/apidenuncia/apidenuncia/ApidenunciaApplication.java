package br.com.apidenuncia.apidenuncia;

import br.com.apidenuncia.apidenuncia.domain.Data;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApidenunciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidenunciaApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
		JsonNode node = restTemplate.exchange("http://www.mapquestapi.com/geocoding/v1/reverse?key=nuoSe73rYH8EYUmGRPhaBJAzj8yF5qY6&location=-15.789925709252136,-47.887251273393815&includeRoadMetadata=true&includeNearestIntersection=true", HttpMethod.GET, null, JsonNode.class).getBody();
		assert node != null;
		System.out.println(node.asText("results"));

	}

}
