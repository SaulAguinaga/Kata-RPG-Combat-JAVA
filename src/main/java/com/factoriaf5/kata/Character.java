package com.factoriaf5.kata;

public class Character {

    private int health;
    private int level;
    private boolean alive;
    private String name;
    private int maxRange;

    public Character(String name, int maxRange) {
        this.health = 1000;
        this.level = 1;
        this.alive = true;
        this.name = name;
        this.maxRange = maxRange;
    }
    public Character(String name) {
        this.health = 1000;
        this.level = 1;
        this.alive = true;
        this.name = name;
        this.maxRange = 0;
    }
    

    
    public void DealDamage(Character character, int damage){
        if(character.getLevel()>= this.getLevel()+5){
            damage *= 0.5;
            System.out.println(damage);
        }
        if(character.getLevel()<= this.getLevel()-5){
            damage *=1.5;
        }
        if(character.getName() == this.getName()){
            System.out.println(character.getName() + " no puede atacarse a sí mismo!!!");
        }else if(character.isAlive()==true){
            if(damage >= character.getHealth()){
                character.setAlive(false);
                character.setHealth(0);
            }
            else{
                character.setHealth(character.getHealth() - damage);
            }
        }
        else{
            System.out.println(character.getName() + " está muerto!!!");
        }
    }
    public void healCharacter(Character character){
        if(character.alive){
            if (character.getName()==this.getName()) {
                character.setHealth(1500);
                System.out.println("La salud de " + this.getName() + " ha subido a 1500");                
            }
            else{
                System.out.println(this.getName() + " sólo puede curarse a sí mismo");
            }
        }
        else{
            System.out.println("Los muertos no pueden ser curados");
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


    public int getMaxRange() {
        return maxRange;
    }


    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    

}
