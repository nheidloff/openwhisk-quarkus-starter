package com.ibm.openwhiskquarkus;

import java.util.Objects;

public class InputValue {

    private Input value;

    public InputValue() {
    }

    public InputValue(Input value) {
        this.value = value;
    }

    public Input getValue() {
        return this.value;
    }

    public void setValue(Input value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof InputValue)) {
            return false;
        }

        InputValue other = (InputValue) obj;

        return Objects.equals(other.value, this.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }
}
