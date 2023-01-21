package Armor;
import Character.*;
import constant.Enum;
import constant.Hero_Attribute;
import exceptionsCustoms.Invalid_Armor_Custom_Exception;
import exceptionsCustoms.Invalid_Level_Custom_Exception;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ArmorTest {
   // in this function passing and checking it correlty inserted or not and inserting level and hero weapon values in it
    @Test
    public void test_Armor_Creation_1() {

        Armors armor_Obj = new Armors("Plate Armor", 5, Enum.Slot_Enum.Body, Enum.Armor_Type_Enum.Plate, 3, 2, 1);


        assertEquals("Plate Armor", armor_Obj.getName_obj());

        assertEquals(5, armor_Obj.getRequired_Level_Obj());

        assertEquals(Enum.Slot_Enum.Body, armor_Obj.getSlot());

        assertEquals(Enum.Armor_Type_Enum.Plate, armor_Obj.getArmor_Type_obj());

        Hero_Attribute attributes_Obj = armor_Obj.getArmor_Attribute_Obj();
        assertEquals(3, attributes_Obj.getStrength_obj());
        assertEquals(2, attributes_Obj.getDexterity_Obj());
        assertEquals(1, attributes_Obj.getIntelligence_Obj());
    }

// in this function passing and checking it correlty inserted or not and inserting level and hero weapon values in it

    @Test
    public void test_Equip_Armor_2() {

        Hero mage_Obj = new Mage("Hero");
        Armors armor_Obj = new Armors("Armor", 2, Enum.Slot_Enum.Body, Enum.Armor_Type_Enum.Cloth, 0, 0, 0);

        try {
            mage_Obj.equip(armor_Obj);
            fail("Expected InvalidLevelException to be thrown");
        } catch (Invalid_Level_Custom_Exception e) {

            int level_Obj = 1;
            int required_Level_Obj = 2;
            assertEquals("Cannot equip equipment with player level: " + level_Obj + ". Player has to be level: " + required_Level_Obj, e.getMessage());
        } catch (Invalid_Armor_Custom_Exception e) {
            fail("Expected InvalidLevelException to be thrown, not InvalidArmorException");
        }

        mage_Obj.level_Up_M();

        try {
            mage_Obj.equip(armor_Obj);
            assertEquals(armor_Obj, mage_Obj.equipment().get(Enum.Slot_Enum.Body));
        } catch (Invalid_Level_Custom_Exception e) {
            fail("Expected Armor to be equipped, not InvalidLevelException to be thrown");
        } catch (Invalid_Armor_Custom_Exception e) {
            fail("Expected Armor to be equipped, not InvalidArmorException to be thrown");
        }
    }

}
