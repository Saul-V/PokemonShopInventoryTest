package com.example.pokemonshopinventorytest;

public class Item {

    private String name;
    private String spriteIMG;

    public Item(String name, String spriteIMG) {
        this.name = name;
        this.spriteIMG = spriteIMG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpriteIMG() {
        return spriteIMG;
    }

    public void setSpriteIMG(String spriteIMG) {
        this.spriteIMG = spriteIMG;
    }

}
