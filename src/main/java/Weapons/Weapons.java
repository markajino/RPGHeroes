package Weapons;

import Character.Hero;
import constant.Enum;
import constant.Items_ab;
import exceptionsCustoms.Invalid_Armor_Custom_Exception;
import exceptionsCustoms.Invalid_Level_Custom_Exception;
import exceptionsCustoms.Invalid_Weapon_Custom_Exception;

public class Weapons extends Items_ab {

    private int weapon_Damage_Obj;
    private Enum.Weapon_Type_Enum weapon_Type_Enum_Obj;


    public Weapons(String name_Obj, int required_Level_Obj, int weapon_Damage_Obj, Enum.Weapon_Type_Enum weapon_Type_Enum_Obj, Enum.Slot_Enum slotEnum) {

        super(name_Obj, required_Level_Obj, Enum.Slot_Enum.Weapon);
        this.weapon_Damage_Obj = weapon_Damage_Obj;
        this.weapon_Type_Enum_Obj = weapon_Type_Enum_Obj;
    }
  //make geeter and setter
    public Enum.Weapon_Type_Enum getWeaponType() {
        return weapon_Type_Enum_Obj;
    }

    public int getWeapon_Damage_Obj() {
        return weapon_Damage_Obj;
    }
//in this function can which wepon can use
    @Override
    public boolean c_Use_Weapons(Hero hero_Obj) throws Invalid_Level_Custom_Exception, Invalid_Weapon_Custom_Exception, Invalid_Armor_Custom_Exception {

        if (!super.c_Use_Weapons(hero_Obj)) {

            return false;
        }

        if (!hero_Obj.getValid_Weapon_Types_Obj().contains(weapon_Type_Enum_Obj)) {

            throw new Invalid_Weapon_Custom_Exception(hero_Obj.getClass().getSimpleName(), getName_obj());
        }

        return true;
    }
    //superclass calling of to string and return name object
    @Override
    public String toString() {
        return getName_obj();
    }

    public int getDamage() {
        return weapon_Damage_Obj;
    }
}


