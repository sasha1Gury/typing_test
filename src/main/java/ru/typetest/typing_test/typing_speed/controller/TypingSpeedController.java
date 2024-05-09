package ru.typetest.typing_test.typing_speed.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.typetest.typing_test.typing_speed.model.TypingInput;
import ru.typetest.typing_test.typing_speed.model.TypingSpeedResult;
import ru.typetest.typing_test.typing_speed.service.TypingSpeedService;

@RestController
@RequiredArgsConstructor
public class TypingSpeedController {
    private final TypingSpeedService service;
    @PostMapping("/check-typing-speed")
    public TypingSpeedResult checkTypingSpeed(@RequestBody TypingInput input) {
        return service.checkTypingSpeed(input);
    }
}
