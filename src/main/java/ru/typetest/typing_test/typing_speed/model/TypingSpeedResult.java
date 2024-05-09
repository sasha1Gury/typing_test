package ru.typetest.typing_test.typing_speed.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TypingSpeedResult {
    private String typedText;
    private long typingSpeed;
}

