package br.com.apidenuncia.apidenuncia.proxy;

import br.com.apidenuncia.apidenuncia.domain.Endereco;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

public class EnderecoClient {

    private EnderecoClient(){}

    public static Endereco get(BigDecimal latitude, BigDecimal longitude){
        RestTemplate restTemplate = new RestTemplate();
        var response = restTemplate.exchange("http://www.mapquestapi.com/geocoding/v1/reverse?key=nuoSe73rYH8EYUmGRPhaBJAzj8yF5qY6&location="
                + latitude + "," + longitude +"&includeRoadMetadata=true&includeNearestIntersection=true", HttpMethod.GET, null, Object.class);
        return null;
    }

}
