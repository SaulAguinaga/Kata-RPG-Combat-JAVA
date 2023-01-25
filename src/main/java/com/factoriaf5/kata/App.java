package com.factoriaf5.kata;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Character ironMan = new Character("Iron Man", 25);
        Character thanos = new Character("Thanos", 1);

        ironMan.setLevel(45);
        thanos.setLevel(40);

        ironMan.DealDamage(thanos, 100);
        System.out.println(thanos);
        

       

    }
}
