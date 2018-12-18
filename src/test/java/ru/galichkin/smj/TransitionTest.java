package ru.galichkin.smj;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class TransitionTest {

    @Test
    void shouldCreateTransitionWithName() {
        Transition transition = new Transition("Trn", started);
        assertThat(transition.name(), is("Trn"));
    }
}
