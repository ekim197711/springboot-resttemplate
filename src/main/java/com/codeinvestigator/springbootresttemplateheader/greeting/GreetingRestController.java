package com.codeinvestigator.springbootresttemplateheader.greeting;

import com.codeinvestigator.springbootresttemplateheader.weather.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class GreetingRestController {
    private final WeatherService weatherService;

    @GetMapping("/greeting/goodmorning")
    public String goodmorning(){
        String weatherforecast = weatherService.forecast();
        String s = String.format("Goodmorning... I think the weather will be: \n %s", weatherforecast);
        return s;
    }
}
