package Weapons;

import Character.Hero;
import Character.Mage;
import constant.Enum;
import exceptionsCustoms.Invalid_Level_Custom_Exception;
import exceptionsCustoms.Invalid_Weapon_Custom_Exception;
import org.junit.jupiter.api.Test;

import static constant.Enum.Weapon_Type_Enum.Sword;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class WeaponTest {
    //in this function checking weapon is matching or not and checking level
    @Test
    public void test_Weapon_Creation_1() {

        Weapons s_word_Obj = new Weapons("Sword",3,7,Sword, Enum.Slot_Enum.Weapon);

        assertEquals("Sword", s_word_Obj.getName_obj());
        assertEquals(3, s_word_Obj.getRequired_Level_Obj());
        assertEquals(Enum.Slot_Enum.Weapon, s_word_Obj.getSlot());
        assertEquals(Enum.Weapon_Type_Enum.Sword, s_word_Obj.getWeaponType());
        assertEquals(7, s_word_Obj.getDamage());
    }

    //in this function checking weapon is matching or not and checking level
    @Test
    public void test_Equip_Weapon_2() {
        Hero mage_Obj = new Mage("Mystogan");
        Weapons weapon_Obj = new Weapons("Test Weapon", 2, 10, Enum.Weapon_Type_Enum.Staff, Enum.Slot_Enum.Weapon);

        try {
            mage_Obj.equip(weapon_Obj);
            fail("Should have thrown InvalidLevelException");
        } catch (Invalid_Level_Custom_Exception e) {
            int level = 1;
            int requiredLevel_Obj = 2;
            assertEquals("Cannot equip equipment with player level: " + level + ". Player has to be level: " + requiredLevel_Obj, e.getMessage());
        } catch (Invalid_Weapon_Custom_Exception e) {
            fail("Should have thrown InvalidLevelException");
        }

        mage_Obj.level_Up_M();

        try {
            mage_Obj.equip(weapon_Obj);
        } catch (Invalid_Level_Custom_Exception | Invalid_Weapon_Custom_Exception e) {
            fail("Should not have thrown an exception");
        }

        assertEquals(weapon_Obj, mage_Obj.equipment().get(Enum.Slot_Enum.Weapon));
    }


}
