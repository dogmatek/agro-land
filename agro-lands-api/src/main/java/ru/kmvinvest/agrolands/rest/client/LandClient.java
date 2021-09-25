package ru.kmvinvest.agrolands.rest.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kmvinvest.agrolands.rest.dto.LandDTO;

import java.util.List;

@Tag(name=LandClient.CONTROLLER_TAG, description = "Получение информации по з/у")
@RestController
public interface LandClient {

    String CONTROLLER_TAG = "lands";
    String BASE_URI = CONTROLLER_TAG;

    @Operation(
            tags={CONTROLLER_TAG},
            summary = "Получить список з/у",
            description = "Получает данные"
    )
    @ApiResponse(
            description = "Список данных успешно получен",
            responseCode = "200",
            content = @Content(schema = @Schema(implementation = LandDTO.class))

    )
    @GetMapping(value = BASE_URI)
    ResponseEntity<List<LandDTO>> getLands();
}