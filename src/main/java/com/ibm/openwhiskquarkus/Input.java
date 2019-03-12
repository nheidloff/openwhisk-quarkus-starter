package com.ibm.openwhiskquarkus;

import java.util.Objects;

public class Input {

    private String name;

    public Input() {
    }

    public Input(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Input)) {
            return false;
        }

        Input other = (Input) obj;

        return Objects.equals(other.name, this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
