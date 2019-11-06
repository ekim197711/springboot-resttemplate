package com.codeinvestigator.springbootresttemplateheader.weather;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final RestTemplate restTemplate;
    public String forecast(){
        URI url= URI.create("http://localhost:8080/developer/weathertoday");
        return restTemplate.getForObject(url, String.class);
    }
}
