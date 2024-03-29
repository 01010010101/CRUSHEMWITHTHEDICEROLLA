package org.waaagh.model;


import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.waaagh.num.Culture;
import org.waaagh.num.Race;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "char_lists")
public class CharList {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private int age;
    @Column
    private int wounds;
    //Stats//
    //PHYS-block//
@Column
private int STRENGTH;
@Column
private int DEXTERITY;
@Column
private int ENDURANCE;
    //MAG-block//
@Column
private int MAGICK;
    @Column
    private int ENERGY = MAGICK * 10;
    //MENTAL-block//
@Column
private int INTUITION;
@Column
private int PERCEPTION;
    @Column
    private int MENTALDEFENCE = INTUITION+PERCEPTION;
    //SOCIAL-block//
@Column
private int KNOWLEGE;
@Column
private int CHARISMA;
    //Appearance//
@Column
private double Height;
@Column
private double Weight;
@Column
private double SizeMod = (((Height-160)/30)*0.5)+(((Weight-60)/30)*0.5)+1;

    //SkillsRacial//
    private Race Race;
    private Culture Culture;
    //SkillsBackstory//
    //SkillsLinear//
    //SkillsActive//
    //SkillsPassive//
    //SkillsUnique//

    //Equipment//
    //Weapons//

    //Inventory//

    @ManyToMany(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinTable(name = "chars_skills",
            joinColumns = {@JoinColumn(name = "char_id")},
            inverseJoinColumns = @JoinColumn(name = "skill_name"))
    private Set<Skill> Skills;
    public void addSkill(Skill skill){
        if (Skills == null) {
            Skills = new HashSet<>();
        }
        Skills.add(skill);
    }

    public CharList() {
    }
}
