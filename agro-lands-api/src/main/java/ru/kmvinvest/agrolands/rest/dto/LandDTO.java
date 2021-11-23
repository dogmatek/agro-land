package ru.kmvinvest.agrolands.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate created;

    private List<OwnerDTO> owners;

    private String description;
}
