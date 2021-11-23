package ru.kmvinvest.agrolands.service.impl;

import org.springframework.stereotype.Service;
import ru.kmvinvest.agrolands.rest.dto.LandDTO;
import ru.kmvinvest.agrolands.rest.dto.OwnerDTO;
import ru.kmvinvest.agrolands.service.LandService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class LandServiceImpl implements LandService {
    @Override
    public List<LandDTO> getLands() {
        List<LandDTO> land = Collections.singletonList(LandDTO.builder()
                .cadNum("25:21:1232323:233")
                .address("address")
                .area(1000000)
                .created(LocalDate.now())
                .description("description")
                .owners(
                        new ArrayList<>(Collections.singletonList(OwnerDTO.builder()
                        .name("Иванов Иван Иванович")
                        .inn("0123456789")
                        .address("address")
                        .build())))
                .build()
        );
        return land;
    }
}
