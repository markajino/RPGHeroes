package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WarriorTest {
    //inn this function Warrior added name and check strength dextertity and intelligence

    @Test
    public void test_Warrior_Level_Up_1() {
        Hero warrior_Obj = new Warrior("Kenpachi Zaraki");

        assertEquals("Kenpachi Zaraki",warrior_Obj.getName_Obj());
        assertEquals(1, warrior_Obj.getLevel_Obj());
        assertEquals(5, warrior_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(2, warrior_Obj.getTotalAttributes().getDexterity_Obj());
        assertEquals(1, warrior_Obj.getTotalAttributes().getIntelligence_Obj());

        warrior_Obj.level_Up_M();

        assertEquals(2, warrior_Obj.getLevel_Obj());
        assertEquals(8, warrior_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(4, warrior_Obj.getTotalAttributes().getDexterity_Obj());
        assertEquals(2, warrior_Obj.getTotalAttributes().getIntelligence_Obj());
    }
    //inn this function Warrior  checking level

    @Test
    void test_Level_Up_2() {
        Warrior warrior_Obj = new Warrior("Test Warrior");
        warrior_Obj.level_Up_M();
        int unexpected_Obj = 3;
        int actual = warrior_Obj.getLevel_Obj();
        assertNotEquals(unexpected_Obj, actual);
    }


}
