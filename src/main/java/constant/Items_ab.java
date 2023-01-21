package constant;
import Character.Hero;
import exceptionsCustoms.Invalid_Armor_Custom_Exception;
import exceptionsCustoms.Invalid_Level_Custom_Exception;
import exceptionsCustoms.Invalid_Weapon_Custom_Exception;

public abstract class Items_ab {
    //Make flieds
    private String name_obj;
    private int required_Level_Obj;
    protected Enum.Slot_Enum slot_Enum_Obj;
    public Items_ab(String name_obj, int required_Level_Obj, Enum.Slot_Enum slot_Enum_Obj) {
        this.name_obj = name_obj;
        this.required_Level_Obj = required_Level_Obj;
        this.slot_Enum_Obj = slot_Enum_Obj;
    }
   //make getter and setters
    public Enum.Slot_Enum getSlot() {
        return slot_Enum_Obj;
    }

    public String getName_obj() {
        return name_obj;
    }

    public int getRequired_Level_Obj() {
        return required_Level_Obj;
    }
    // check which weapon can use it
    protected boolean c_Use_Weapons(Hero hero_Obj) throws Invalid_Weapon_Custom_Exception, Invalid_Level_Custom_Exception, Invalid_Armor_Custom_Exception {

        if (hero_Obj.getLevel_Obj() < getRequired_Level_Obj()){

            throw new Invalid_Level_Custom_Exception(hero_Obj.getLevel_Obj(), getRequired_Level_Obj());
        }

        return true;
    }
}

