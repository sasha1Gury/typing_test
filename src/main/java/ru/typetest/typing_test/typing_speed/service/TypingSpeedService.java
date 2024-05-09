package ru.typetest.typing_test.typing_speed.service;

import org.springframework.stereotype.Service;
import ru.typetest.typing_test.typing_speed.model.TypingInput;
import ru.typetest.typing_test.typing_speed.model.TypingSpeedResult;

@Service
public class TypingSpeedService {

    public TypingSpeedResult checkTypingSpeed(TypingInput input) {
        TypingSpeedResult result = new TypingSpeedResult();
        result.setTypingSpeed(input.getTime()/50);
        result.setTypedText("sdfsdf");
        return result;
    }

}
