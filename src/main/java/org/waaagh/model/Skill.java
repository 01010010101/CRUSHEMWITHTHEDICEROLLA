package org.waaagh.model;

import lombok.Data;
import org.waaagh.num.SkillType;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @Column(length = 30)
    private String name;
    private SkillType SkillType;
    private String SkillText;
    private String SkillSTATDependency;
    private String SkillActionCost;
    private Integer SkillCost;
    private Integer SkillCooldown;
    private String SkillEffect;

    public Skill() {
    }
}
