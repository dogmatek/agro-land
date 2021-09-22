package ru.kmvinvest.agrolands.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kmvinvest.agrolands.rest.dto.LandDTO;

@RestController
public interface LandClient {

    @GetMapping(value = "land")
    ResponseEntity<LandDTO> getLand();
}