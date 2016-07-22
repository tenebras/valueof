package com.sixsystems.valueof.validator;

public class StringValidator {

    private String value;
    public final StringValidator should = this;
    public final StringValidator be = this;
    public final StringValidator have = this;
    public final StringValidator and = this;

    public StringValidator(String value) {
        this.value = value;
    }

    public StringValidator startsWith(String value, String errorMessage) {
        return this;
    }

    public StringValidator startsWith(String value) {
        return startsWith(value, String.format("String [%s] doesn't starts with [%s]", this.value, value));
    }

    public StringValidator endsWith(String value, String errorMessage) {
        return this;
    }

    public StringValidator endsWith(String value) {
        return endsWith(value, String.format("String [%s] doesn't starts with [%s]", this.value, value));
    }

    public StringValidator lengthBetween(int min, int max, String errorMessage) {
        return this;
    }

    public StringValidator lengthBetween(int min, int max) {
        return this.lengthBetween(min, max, String.format("String [%s] doesn't match length requirements %d - %d", this.value, min, max));
    }

    public StringValidator length(int exactLength, String message) {
        return this;
    }

    public StringValidator length(int exactLength) {
        return length(exactLength, String.format("String [%s] length should be exactly %d", this.value, exactLength));
    }
}
