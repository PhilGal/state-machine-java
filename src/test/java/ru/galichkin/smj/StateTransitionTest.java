package ru.galichkin.smj;

import java.util.Set;
import org.junit.jupiter.api.Test;

class StateTransitionTest {

    @Test
    void shouldCreateStateWithTransition() {

        State initial = new State("Initial");
        State started = new State("Started");
        Transition start = new Transition("start", started);

        initial.add(start);

        Set<Transition> transitions = initial.transitions();
    }
}
