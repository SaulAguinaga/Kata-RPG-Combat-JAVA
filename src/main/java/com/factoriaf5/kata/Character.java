package com.factoriaf5.kata;

public class Character {

    private int health;
    private int level;
    private boolean alive;
    private String name;

    public Character(String name) {
        this.health = 1000;
        this.level = 1;
        this.alive = true;
        this.name= name;
    }

    
    public void DealDamage(Character character, int damage){
        if(character.isAlive()==true){
            if(damage >= character.getHealth()){
                character.setAlive(false);
            }
            else{
                character.setHealth(character.getHealth() - damage);
            }
        }
        else{
            System.out.println(character.getName() + " está muerto!!!");
        }
    }

    public void setName(String name) {
            this.name = name;
        } 
    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Character [health=" + health + ", level=" + level + ", alive=" + alive + ", name=" + name + "]";
    }

    

}
