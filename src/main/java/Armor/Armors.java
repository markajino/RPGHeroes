package Armor;

import constant.Enum;
import constant.Hero_Attribute;
import constant.Items_ab;

public class Armors extends Items_ab {

    private Enum.Armor_Type_Enum armor_Type_obj;
    private Hero_Attribute Armor_Attribute_Obj;

    public Armors(String name_Obj, int required_Level_Obj, Enum.Slot_Enum slot_Enum_Obj, Enum.Armor_Type_Enum armor_Type_obj, int strength_Obj, int dexterity_Obj, int intelligence_Obj) {
// call the super    class constructor of items and passing values
        super(name_Obj, required_Level_Obj, slot_Enum_Obj);
        this.armor_Type_obj = armor_Type_obj;
        this.Armor_Attribute_Obj = new Hero_Attribute(strength_Obj, dexterity_Obj, intelligence_Obj);
    }
    // getter function armor type
    public Enum.Armor_Type_Enum getArmor_Type_obj() {
        return armor_Type_obj;
    }
    // getter function
    public Hero_Attribute getArmor_Attribute_Obj() {
        return Armor_Attribute_Obj;
    }
    // override the toString function  superclass
    // returns name   armor
    @Override
    public String toString() {
        return getName_obj();
    }
}



