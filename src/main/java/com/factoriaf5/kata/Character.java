package com.factoriaf5.kata;

public class Character {

    private int health;
    private int level;
    private boolean alive;
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character(String name) {
        this.health = 1000;
        this.level = 1;
        this.alive = true;
        this.name= name;
    }

    public void DealDamage(Character character){
        character.setHealth(this.health-100);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    

}
