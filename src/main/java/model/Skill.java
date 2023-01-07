package model;

import lombok.Data;

import javax.persistence.Id;

@Data
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
