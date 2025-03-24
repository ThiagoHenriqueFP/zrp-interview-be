package com.zrp.demo.infrastructure.exceptions;

import com.zrp.demo.infrastructure.dto.ErrorResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@org.springframework.web.bind.annotation.ControllerAdvice(annotations = RestController.class)
public class ControllerAdvice {

    @ExceptionHandler(ResponseStatusException.class)
    protected ResponseEntity<ErrorResponseDTO> responseEntityExceptionHandler(ResponseStatusException ex) {
        return new ResponseEntity<>(
                new ErrorResponseDTO(ex.getMessage()), ex.getStatusCode()
        );
    }
}
