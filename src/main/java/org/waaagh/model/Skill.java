package org.waaagh.model;

import lombok.Data;
import org.waaagh.num.Actions;
import org.waaagh.num.SkillType;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @Column(length = 248)
    private String name;
    private SkillType SkillType;
    @Column(length = 1024)
    private String SkillText;
    private String SkillFlashText;
    private String SkillSTATDependency;
    private Integer SkillLevel;
    private Actions SkillActionCost;
    private Integer SkillStaminaCost;
    private Integer SkillCooldown;
    private String SkillEffect;

    public Skill() {
    }
}
