package Character;

import constant.Enum;

import java.util.Arrays;


public class Rogue extends Hero {


    public Rogue(String name_Obj) {
        super(name_Obj, Enum.Roles_Enum.Rogue, 2, 6, 1);
        //add leather and mail in armor types
        getValid_Armor_Types_Obj().addAll(Arrays.asList(Enum.Armor_Type_Enum.Leather, Enum.Armor_Type_Enum.Mail));
        //add dagger and sword in weapon types
        getValid_Weapon_Types_Obj().addAll(Arrays.asList(Enum.Weapon_Type_Enum.Dagger, Enum.Weapon_Type_Enum.Sword));
    }

    @Override
    public void level_Up_M() {
        level_Up_M(1,4,1);
    }





}