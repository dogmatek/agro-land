package ru.kmvinvest.agrolands.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.kmvinvest.agrolands.rest.client.LandClient;
import ru.kmvinvest.agrolands.rest.dto.LandDTO;
import ru.kmvinvest.agrolands.service.impl.LandServiceImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LandController implements LandClient {

    private final LandServiceImpl landService;

    @Override
    public ResponseEntity<List<LandDTO>> getLands() {
        return ResponseEntity.ok(landService.getLands());
    }
}
