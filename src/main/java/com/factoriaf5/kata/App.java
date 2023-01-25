package com.factoriaf5.kata;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Character ironMan = new Character("Iron Man");
        Character thanos = new Character("Thanos");

        ironMan.setLevel(45);
        thanos.setLevel(40);

        ironMan.DealDamage(thanos, 100);
        System.out.println(thanos);
        

       

    }
}
