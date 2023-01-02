package model;


import lombok.Data;

@Data
public class CharList {
    private String name;
    private int age;
    private int wounds;
    //Stats//
    //PHYS-block//
private int STRENGTH;
private int DEXTERITY;
private int ENDURANCE;
    //MAG-block//
private int MAGICK;
    private int ENERGY = MAGICK * 10;
    //MENTAL-block//
private int INTUITION;
private int PERCEPTION;
    private int MENTALDEFENCE = INTUITION+PERCEPTION;
    //SOCIAL-block//
private int KNOWLEGE;
private int CHARISMA;
    //Appearance//
private double Height;
private double Weight;
private double SizeMod = (((Height-160)/30)*0.5)+(((Weight-60)/30)*0.5)+1;
    //SkillsRacial//
    private int Race;
    private int Culture;
    //SkillsBackstory//
    //SkillsLinear//
    //SkillsActive//
    //SkillsPassive//
    //SkillsUnique//

    //Equipment//
    //Weapons//

    //Inventory//
}
