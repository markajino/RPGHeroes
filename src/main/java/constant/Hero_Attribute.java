package constant;

public class Hero_Attribute {
   // make fileds
    private int strength_obj;
    private int dexterity_Obj;
    private int intelligence_Obj;

    public Hero_Attribute(int strength_obj, int dexterity_Obj, int intelligence_Obj){

        this.strength_obj = strength_obj;
        this.dexterity_Obj = dexterity_Obj;
        this.intelligence_Obj = intelligence_Obj;
    }
    //in this function to add values in strength dexterity and intellijnce
    public void add_Attribut_(int strength_Obj, int dexterity_Obj, int intelligence_Obj){

        this.strength_obj += strength_Obj;
        this.dexterity_Obj += dexterity_Obj;
        this.intelligence_Obj += intelligence_Obj;
    }
   // Make getter and setter
    public int getStrength_obj() {
        return strength_obj;
    }

    public int getDexterity_Obj() {
        return dexterity_Obj;
    }

    public int getIntelligence_Obj() {
        return intelligence_Obj;
    }

}




