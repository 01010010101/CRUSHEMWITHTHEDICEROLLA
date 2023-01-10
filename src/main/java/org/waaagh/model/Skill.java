package org.waaagh.model;

import lombok.Data;
import org.waaagh.num.SkillType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    private String SkillName;
    private SkillType SkillType;
    private String SkillText;
    private String SkillSTATDependency;
    private String SkillActionCost;
    private Integer SkillCost;
    private Integer SkillCooldown;
    private String SkillEffect;

}
