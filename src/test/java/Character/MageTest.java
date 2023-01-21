package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MageTest {
    //inn this function mage added name and check strength dextertity and intelligence
    @Test
    public void test_Mage_Level_Up_1() {

        Mage mage_Obj = new Mage("Mystogan");
        assertEquals("Mystogan",mage_Obj.getName_Obj());
        assertEquals(1, mage_Obj.getLevel_Obj());
        assertEquals(1, mage_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(1, mage_Obj.getTotalAttributes().getDexterity_Obj());
        assertEquals(8, mage_Obj.getTotalAttributes().getIntelligence_Obj());

        mage_Obj.level_Up_M();

        assertEquals(2, mage_Obj.getLevel_Obj());
        assertEquals(2, mage_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(2, mage_Obj.getTotalAttributes().getDexterity_Obj());
        assertEquals(13, mage_Obj.getTotalAttributes().getIntelligence_Obj());
    }

}
