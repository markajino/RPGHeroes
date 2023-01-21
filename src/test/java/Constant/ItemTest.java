package Constant;

import Weapons.*;
import constant.Enum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
     //in this function about weapons values is matching or not
    @Test
    void Test_GetName_ShouldMatch_1() {
        Weapons item_Obj = new Weapons("Axe", 120, 1, Enum.Weapon_Type_Enum.Axes, Enum.Slot_Enum.Weapon);
        String expected = "Axe";
        String actual = item_Obj.getName_obj();
        assertEquals(expected, actual);
    }
    //in this function about weapons values is matching or not
    @Test
    void Test_GetRequiredLevel_Should_Match_2() {
        Weapons item_Obj = new Weapons("Axe", 120, 1, Enum.Weapon_Type_Enum.Axes, Enum.Slot_Enum.Weapon);
        int expected = 120;
        int actual = item_Obj.getRequired_Level_Obj();
        assertEquals(expected, actual);
    }
    //in this function about weapons values is matching or not
    @Test
    void Test_GetSlot_Should_Match_3() {
        Weapons item_Obj = new Weapons("Axe", 120, 1, Enum.Weapon_Type_Enum.Axes, Enum.Slot_Enum.Weapon);
        Enum.Slot_Enum expected = Enum.Slot_Enum.Weapon;
        Enum.Slot_Enum actual = item_Obj.getSlot();
        assertEquals(expected, actual);
    }


}
