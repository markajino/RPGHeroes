package Character;

import constant.Enum;

import java.util.Arrays;

public class Warrior  extends Hero {


    public Warrior(String name_Obj) {
        super(name_Obj, Enum.Roles_Enum.Warrior, 5, 2, 1);
        //add mail and plate in armor types
        getValid_Armor_Types_Obj().addAll(Arrays.asList(Enum.Armor_Type_Enum.Mail, Enum.Armor_Type_Enum.Plate));
        //add axes hammer and sword in weapon types
        getValid_Weapon_Types_Obj().addAll(Arrays.asList(Enum.Weapon_Type_Enum.Axes, Enum.Weapon_Type_Enum.Hammer, Enum.Weapon_Type_Enum.Sword));
    }

    @Override
    public void level_Up_M() {
        level_Up_M(3, 2, 1);
    }





}
