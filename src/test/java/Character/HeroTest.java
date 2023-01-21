package Character;

import constant.Enum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class HeroTest {
    //in this function inseert value in mage and checking it working properlly
    @Test
    public void test_Hero_Creation_1() {

        Hero hero_Obj = new Mage("Mystogan");

        assertEquals("Mystogan", hero_Obj.getName_Obj());
        assertEquals(Enum.Roles_Enum.Mage, hero_Obj.getRole_Obj());
        assertEquals(1, hero_Obj.getLevel_Obj());
        assertEquals(1, hero_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(1, hero_Obj.getTotalAttributes().getDexterity_Obj());
        assertEquals(8, hero_Obj.getTotalAttributes().getIntelligence_Obj());
    }

    //in this function inseert value in Warrior and checking it working properlly
    @Test
    public void test_Level_Up_2() {
        Hero hero_Obj = new Warrior("Test Hero");

        assertEquals(1, hero_Obj.getLevel_Obj());
        assertEquals(5, hero_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(2, hero_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(1, hero_Obj.getTotalAttributes().getIntelligence_Obj());

        hero_Obj.level_Up_M(3, 2, 1);

        assertEquals(2, hero_Obj.getLevel_Obj());
        assertEquals(8, hero_Obj.getTotalAttributes().getStrength_obj());
        assertEquals(4, hero_Obj.getTotalAttributes().getDexterity_Obj());
        assertEquals(2, hero_Obj.getTotalAttributes().getIntelligence_Obj());
    }


    



}




