package com.ifmo.jjd.hometask6;

public class Author {
    public String firstName;
    public String secondName;

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().length() < 1) {
            throw new IllegalArgumentException("Имя не может быть меньше одного символа");
        }
        this.firstName = firstName;
    }

    public String getSecondName() {

        return secondName;
    }

    public void setSecondName(String secondName) {
        if (secondName == null || secondName.trim().length() < 1) {
            throw new IllegalArgumentException("Фамилия не может быть меньше одного символа");
        }
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "" +
                "" + firstName +
                " " + secondName
                ;
    }
}
