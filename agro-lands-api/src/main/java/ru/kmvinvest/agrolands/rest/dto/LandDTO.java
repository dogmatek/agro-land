package ru.kmvinvest.agrolands.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LandDTO {

    private String cadNum;

    private String address;

    private Integer area;

    private LocalDate created;

    private List<OwnerDTO> owners;

    private String description;
}
