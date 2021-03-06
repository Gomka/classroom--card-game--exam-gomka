package com.drpicox.game.testSteps.play;

import com.drpicox.game.testPost.reader.PostLine;
import com.drpicox.game.testSteps.AbstractPostLineStep;
import org.springframework.stereotype.Component;

@Component
public class ThePileIsNotHighlighted extends AbstractPostLineStep {

    @Override
    protected String getRegex() {
        return "The _([^_]+)_ pile is not highlighted";
    }

    @Override
    protected void run(PostLine line, String[] match) {
        // No implementation required by tests in backend
    }
}
