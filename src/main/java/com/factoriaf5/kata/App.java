package com.factoriaf5.kata;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Character ironMan = new Character("Iron Man");
        Character thanos = new Character("Thanos");
        ironMan.DealDamage(thanos, 1200);
        System.out.println(thanos.getName());
        System.out.println(thanos.getHealth());
        System.out.println(thanos.isAlive());

        System.out.println(ironMan.getName());
        System.out.println(ironMan.getHealth());
        System.out.println(ironMan.isAlive());

        ironMan.DealDamage(thanos, 100);
        System.out.println(thanos.getName());
        System.out.println(thanos.getHealth());
        System.out.println(thanos.isAlive());
        
        System.out.println(ironMan.getName());
        System.out.println(ironMan.getHealth());

    }
}
