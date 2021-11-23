package ru.kmvinvest.agrolands.service;

import ru.kmvinvest.agrolands.rest.dto.LandDTO;

import java.util.List;

public interface LandService {

    List<LandDTO> getLands();
}
