package ru.kmvinvest.agrolands.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.kmvinvest.agrolands.rest.client.LandClient;
import ru.kmvinvest.agrolands.rest.dto.LandDTO;
import ru.kmvinvest.agrolands.rest.dto.OwnerDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

@RestController
@RequiredArgsConstructor
public class LandController implements LandClient {


    @Override
    public ResponseEntity<LandDTO> getLand() {
        LandDTO land = LandDTO.builder()
                .cadNum("25:21:1232323:233")
                .address("address")
                .area(1000000)
                .created(LocalDate.now())
                .description("description")
                .owners(new ArrayList<>(Collections.singletonList(OwnerDTO.builder()
                        .name("Иванов Иван Иванович")
                        .inn("0123456789")
                        .address("address")
                        .build())) )
                .build();
        return ResponseEntity.ok(land);
    }
}
