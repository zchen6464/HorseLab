package com.company;

public class Memes implements Horse{
    private String name;
    private int weight;

    public Memes(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
}
