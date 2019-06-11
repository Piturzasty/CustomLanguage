package com.custom.language;

public class Variable {
    public static Variable VOID = new Variable(new Object());

    private final Object value;
    private final boolean softEquals;

    public Variable(Object value) {
        this.value = value;
        this.softEquals = false;
    }

    public Variable(Object value, boolean softEquals) {
        this.value = value;
        this.softEquals = softEquals;
    }

    public Boolean asBoolean() {
        return Boolean.parseBoolean( String.valueOf(value));
    }

    public Double asDouble() {
        return Double.parseDouble(String.valueOf(value));
    }

    public Integer asInt() {
        return Integer.parseInt(String.valueOf(value));
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    @Override
    public int hashCode() {

        if (value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if (value == o) {
            return true;
        }

        if (value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Variable that = (Variable) o;

        if (softEquals && that.softEquals) {
            return String.valueOf(value).equals(String.valueOf(that.value));
        }

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
