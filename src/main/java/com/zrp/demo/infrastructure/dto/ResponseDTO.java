package com.zrp.demo.infrastructure.dto;

import java.time.LocalDateTime;

public record ResponseDTO<T>(
        T data,
        LocalDateTime timestamp
) {
    public ResponseDTO(T data) {
        this(data, LocalDateTime.now());
    }
}
