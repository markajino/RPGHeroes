package Character;
import Armor.Armors;
import constant.Enum;
import constant.Enum.Weapon_Type_Enum;
import constant.Enum.Armor_Type_Enum;
import constant.Hero_Attribute;
import constant.Items_ab;
import Weapons.Weapons;
import exceptionsCustoms.Invalid_Armor_Custom_Exception;
import exceptionsCustoms.Invalid_Level_Custom_Exception;
import exceptionsCustoms.Invalid_Weapon_Custom_Exception;

import java.util.*;

public abstract class Hero {


    private String name_Obj;
    Enum.Roles_Enum role_Obj;
    private int level_Obj;

    private Hero_Attribute level_Attributes_Obj;
   private HashMap<Enum.Slot_Enum, Items_ab> equipment_Obj = new HashMap<>();
   private ArrayList<Enum.Weapon_Type_Enum> valid_Weapon_Types_Obj = new ArrayList<>();
   private ArrayList<Armor_Type_Enum> valid_Armor_Types_Obj = new ArrayList<>();


    public ArrayList<Weapon_Type_Enum> getValid_Weapon_Types_Obj() {
        return valid_Weapon_Types_Obj;
    }

    public ArrayList<Armor_Type_Enum> getValid_Armor_Types_Obj() {
        return valid_Armor_Types_Obj;
    }




    public String getName_Obj() {
        return this.name_Obj;
    }




    Enum.Roles_Enum getRole_Obj(){
        return role_Obj;
    }


    public int getLevel_Obj() {
        return this.level_Obj;
    }


    public Hero(String name_Obj, Enum.Roles_Enum role_Obj, int strength, int dexterity, int intelligence){

        this.name_Obj = name_Obj;
        this.level_Obj = 1;
        this.role_Obj = role_Obj;
        level_Attributes_Obj = new Hero_Attribute(strength,dexterity,intelligence);
        for (Enum.Slot_Enum slotEnum : Enum.Slot_Enum.values()){
            equipment_Obj.put(slotEnum,null);
        }



    }
    // level of game will be up
    public void level_Up_M(int strength, int dexterity, int intelligence) {
        level_Obj++;
        level_Attributes_Obj.add_Attribut_(strength, dexterity, intelligence);
    }

    public abstract void level_Up_M();

    public  String display_Details_M(){
        //Display data in console
        StringBuilder String_Builder_Var = new StringBuilder();
        String_Builder_Var.append("Name: " + this.getName_Obj() +"\n");
        String_Builder_Var.append("Role: " + getRole_Obj() +"\n");
        String_Builder_Var.append("Level: " + this.getLevel_Obj() +"\n");
        String_Builder_Var.append("Strength: " + getTotalAttributes().getStrength_obj() +"\n");
        String_Builder_Var.append("Dexterity: " + getTotalAttributes().getDexterity_Obj() +"\n");
        String_Builder_Var.append("Intelligence: " + getTotalAttributes().getIntelligence_Obj() +"\n");
        String_Builder_Var.append( getEquipped_Weapon_Item_M() +"\n");
        String_Builder_Var.append( getEquipped_Armor_As_String_M() +"\n");
        String_Builder_Var.append("Damage: " + calculate_Damage_M());
        return String_Builder_Var.toString();
    }



     public void unEquipped_Weapon_M() {

         if (equipment_Obj != null) {
             //deleting weapon from equipment
             equipment_Obj.remove(Enum.Slot_Enum.Weapon);
         }
     }




    public String getEquipped_Weapon_Item_M() {
        //check equipment object is null or not
        if (equipment_Obj != null) {
            Items_ab weapon_Obj = equipment_Obj.get(Enum.Slot_Enum.Weapon);

            if (weapon_Obj != null) {
                return "Equipped Weapon: " + weapon_Obj;
            }
        }

        return "No Weapon equipped";
    }





    public String getEquipped_Armor_As_String_M() {
        StringBuilder string_Builder_Obj = new StringBuilder();
          //check equipment object is null or not
        if (equipment_Obj != null) {
            for (Map.Entry<Enum.Slot_Enum, Items_ab> slot : equipment_Obj.entrySet()) {

                if (slot.getKey().equals(Enum.Slot_Enum.Weapon)) {
                    continue;
                }

                if (slot.getKey() instanceof Enum.Slot_Enum && slot.getValue() != null) {
                    string_Builder_Obj.append(slot.getKey() + ": " + slot.getValue() + " -- ");
                }
            }
        }
        String result_Obj = string_Builder_Obj.toString().replaceAll(" -- $", "");

        if (result_Obj.isEmpty()) {
            return "No Armor equipped";
        }
        return "Equipped Armor: " + result_Obj;
    }





    public String checkWeaponEquiped() {
        return equipment_Obj.toString();
    }

    public Hero_Attribute getTotalAttributes() {
        Hero_Attribute total_Attribute_Obj = new Hero_Attribute(level_Attributes_Obj.getStrength_obj(), level_Attributes_Obj.getDexterity_Obj(), level_Attributes_Obj.getIntelligence_Obj());
        //check equipment and ad in list
        equipment_Obj.forEach((slot, itemsAb) -> {
            if (slot != Enum.Slot_Enum.Weapon && slot != null && itemsAb != null) {
                Armors armors_Obj = (Armors) itemsAb;
                Hero_Attribute attribute_Obj = armors_Obj.getArmor_Attribute_Obj();

                total_Attribute_Obj.add_Attribut_(attribute_Obj.getStrength_obj(), attribute_Obj.getDexterity_Obj(), attribute_Obj.getIntelligence_Obj());
            }
        });

        return total_Attribute_Obj;
    }



    public double calculate_Damage_M() {
        String class_Name_Obj = getClass().getSimpleName();
      // calculate damage by name
        int multiplier_Obj;
        switch (class_Name_Obj) {
            case "Warrior":
                multiplier_Obj = getTotalAttributes().getStrength_obj();
                break;
            case "Mage":
                multiplier_Obj = getTotalAttributes().getIntelligence_Obj();
                break;
            case "Ranger", "Rogue":
                multiplier_Obj = getTotalAttributes().getDexterity_Obj();
                break;
            default:
                multiplier_Obj = 1;
                break;
        }
       // make object
        Weapons weapon_Obj = (Weapons) equipment_Obj.get(Enum.Slot_Enum.Weapon);

        double base_Expression_Obj = (1.0 + ((double) multiplier_Obj / 100.0));
           //check object is null or not
        if (weapon_Obj != null) {
            //formula applied here of calculations
            int weapon_Damage_Obj = weapon_Obj.getWeapon_Damage_Obj();
            base_Expression_Obj *= weapon_Damage_Obj;
        }

        return base_Expression_Obj;
    }


    public void equip(Weapons weapon_Obj) throws Invalid_Level_Custom_Exception, Invalid_Weapon_Custom_Exception {
        //check level is greater or equal
        if (level_Obj >= weapon_Obj.getRequired_Level_Obj()) {
            if (!valid_Weapon_Types_Obj.contains(weapon_Obj.getWeaponType())) {
                throw new Invalid_Weapon_Custom_Exception(getRole_Obj().name(), weapon_Obj.getWeaponType().name());
            } else {
                equipment_Obj.put(Enum.Slot_Enum.Weapon, weapon_Obj);
            }
        } else {
            //throw error in custom excetpion
            throw new Invalid_Level_Custom_Exception(level_Obj, weapon_Obj.getRequired_Level_Obj());
        }
    }

    public void equip(Armors armor_Obj) throws Invalid_Level_Custom_Exception, Invalid_Armor_Custom_Exception {
        //check level required
        if (level_Obj < armor_Obj.getRequired_Level_Obj()) {
            throw new Invalid_Level_Custom_Exception(level_Obj, armor_Obj.getRequired_Level_Obj());
        }
        //check armor type
        if (!valid_Armor_Types_Obj.contains(armor_Obj.getArmor_Type_obj())) {
            throw new Invalid_Armor_Custom_Exception(getRole_Obj(), armor_Obj.getArmor_Type_obj().name());
        }
        equipment_Obj.put(armor_Obj.getSlot(), armor_Obj);
    }

   //return equipment object
    public HashMap<Enum.Slot_Enum, Items_ab> equipment() {
        return equipment_Obj;
    }
}
