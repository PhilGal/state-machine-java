package ru.galichkin.smj;

class Transition {

    private final String name;

    public Transition(String name, State toState) {

        this.name = name;
    }

    public String name() {
        return name;
    }
}
