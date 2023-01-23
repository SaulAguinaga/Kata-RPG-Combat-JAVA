package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void DealDamageTest() {

        Character ironMan = new Character("Iron Man");
        Character thanos = new Character("Thanos");
        ironMan.DealDamage(thanos, 100);
        assertEquals(900, thanos.getHealth());
        
    }

}
