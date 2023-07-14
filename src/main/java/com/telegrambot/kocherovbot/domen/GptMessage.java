package com.telegrambot.kocherovbot.domen;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GptMessage {
    private String role;
    private String content;
}
