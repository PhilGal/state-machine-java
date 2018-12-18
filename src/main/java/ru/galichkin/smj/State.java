package ru.galichkin.smj;

import java.util.Set;

class State {

    private final String name;

    public State(String name) {

        this.name = name;
    }

    public String name() {
        return name;
    }

    public void add(Transition transition) {

    }

    public Set<Transition> transitions() {
        return null;
    }
}
