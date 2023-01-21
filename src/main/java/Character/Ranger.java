package Character;

import constant.Enum;

import java.util.Arrays;

public class Ranger extends Hero {



    public Ranger(String name_Obj) {
        super(name_Obj, Enum.Roles_Enum.Ranger, 1, 7, 1);
        //add leather and mail in armor types
        getValid_Armor_Types_Obj().addAll(Arrays.asList(Enum.Armor_Type_Enum.Leather, Enum.Armor_Type_Enum.Mail));
        //add bows in weapon type
        getValid_Weapon_Types_Obj().add(Enum.Weapon_Type_Enum.Bows);
    }

    @Override
    public void level_Up_M() {
        level_Up_M(1, 5, 1);
    }




}
