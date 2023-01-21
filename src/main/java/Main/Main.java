package Main;

import Armor.Armors;
import constant.Enum;

import Character.*;
import Weapons.Weapons;
import exceptionsCustoms.Invalid_Armor_Custom_Exception;
import exceptionsCustoms.Invalid_Level_Custom_Exception;
import exceptionsCustoms.Invalid_Weapon_Custom_Exception;

import static constant.Enum.Weapon_Type_Enum.*;

public class Main {
    public static void main(String[] args) throws Invalid_Weapon_Custom_Exception, Invalid_Level_Custom_Exception, Invalid_Armor_Custom_Exception {
    //in hero classpassing values in class construtur and make objects
        Hero Mage_Obj = new Mage("Mystogan");
        Hero Ranger_Obj = new Ranger("Zero");
        Hero Rogue_Obj = new Rogue("Jack Jones");
        Hero Warrior_Obj = new Warrior("Kenpachi Zaraki");

        //in weapon class passing values in class construtur and make objects
        Weapons staff_Obj = new Weapons("Staff",1,2, Staff, Enum.Slot_Enum.Weapon);
        Weapons wand_Obj = new Weapons("Wand",1,2, Wand, Enum.Slot_Enum.Weapon);
        Weapons bow_Obj = new Weapons("Bow",1,2,Bows, Enum.Slot_Enum.Weapon);
        Weapons daggers_Obj = new Weapons("Daggers",1,2,Dagger, Enum.Slot_Enum.Weapon);
        Weapons sword_Obj = new Weapons("Sword",1,2,Sword, Enum.Slot_Enum.Weapon);
        Armors cloth_Obj = new Armors("Cloth",1, Enum.Slot_Enum.Head, Enum.Armor_Type_Enum.Cloth,1,1,1);
        Armors leather_Obj = new Armors("Leather",1, Enum.Slot_Enum.Body, Enum.Armor_Type_Enum.Leather,1,1,1);
        Armors plate_Obj = new Armors("Cloth",1, Enum.Slot_Enum.Legs, Enum.Armor_Type_Enum.Plate,1,1,1);
        Armors clot1_Obj = new Armors("Cloth",1, Enum.Slot_Enum.Legs, Enum.Armor_Type_Enum.Leather,1,1,1);
        Armors mail_Obj = new Armors("Mail",1, Enum.Slot_Enum.Head, Enum.Armor_Type_Enum.Mail,1,1,1);
        Mage_Obj.equip(staff_Obj);
        Mage_Obj.equip(cloth_Obj);
        Mage_Obj.unEquipped_Weapon_M();




        System.out.println(Mage_Obj.display_Details_M());


  }


}