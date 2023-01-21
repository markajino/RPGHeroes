package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RogueTest {
    //inn this function Rogue added name and check strength dextertity and intelligence

    @Test
    public void test_Rogue_Level_Up_1() {
        Hero rogue_Obj = new Rogue("Jack Jones");

        assertEquals("Jack Jones",rogue_Obj.getName_Obj());
        assertEquals(1, rogue_Obj.getLevel_Obj());
        assertEquals(2, rogue_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(6, rogue_Obj.getTotalAttributes().getDexterity_Obj());
        assertEquals(1, rogue_Obj.getTotalAttributes().getIntelligence_Obj());

        rogue_Obj.level_Up_M();

        assertEquals(2, rogue_Obj.getLevel_Obj());
        assertEquals(3, rogue_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(10, rogue_Obj.getTotalAttributes().getDexterity_Obj());
        assertEquals(2, rogue_Obj.getTotalAttributes().getIntelligence_Obj());
    }

}

