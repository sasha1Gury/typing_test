package ru.typetest.typing_test.typing_speed.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TypingInput {
    private String input;
    private long time;
}
