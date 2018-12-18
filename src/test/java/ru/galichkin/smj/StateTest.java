package ru.galichkin.smj;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class StateTest {

    @Test
    void shouldCreateStateWithAName() {

        State state = new State("name");

        assertThat(state.name(), is("name"));
    }
}
