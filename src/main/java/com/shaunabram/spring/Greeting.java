package com.shaunabram.spring;

public class Greeting {
    private final String message;

    public Greeting(String message) {
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' +
                '}';
    }
}
