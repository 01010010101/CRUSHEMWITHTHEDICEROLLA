package org.waaagh.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    private String SkillName;
    private String SkillType;
    private String SkillText;
    private String SkillSTATDependency;
    private String SkillActionCost;
    private String SkillCost;
    private String SkillCooldown;
    private String SkillEffect;

}
