package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangerTest {
    //inn this function Ranger added name and check strength dextertity and intelligence
    @Test
    public void test_Ranger_Level_Up_1() {
        Hero ranger_Obj = new Ranger("Zero");

        assertEquals("Zero",ranger_Obj.getName_Obj());
        assertEquals(1, ranger_Obj.getLevel_Obj());
        assertEquals(1, ranger_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(7, ranger_Obj.getTotalAttributes().getDexterity_Obj());

        assertEquals(1, ranger_Obj.getTotalAttributes().getIntelligence_Obj());

        ranger_Obj.level_Up_M();

        assertEquals(2, ranger_Obj.getLevel_Obj());
        assertEquals(2, ranger_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(12, ranger_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(2, ranger_Obj.getTotalAttributes().getIntelligence_Obj());
    }

}
