package Character;
import constant.Enum;
import java.util.Arrays;



public class Mage extends Hero {

    public Mage(String name_Obj) {
        //given name and numbers to superclass
        super(name_Obj, Enum.Roles_Enum.Mage, 1, 1, 8);
        //add staff and wand in weapons
        getValid_Weapon_Types_Obj().addAll(Arrays.asList(Enum.Weapon_Type_Enum.Staff, Enum.Weapon_Type_Enum.Wand));
        //add cloth in armor type
        getValid_Armor_Types_Obj().add(Enum.Armor_Type_Enum.Cloth);
    }
   // add values of level
    @Override
    public void level_Up_M() {
        level_Up_M(1, 1, 5);
    }


}