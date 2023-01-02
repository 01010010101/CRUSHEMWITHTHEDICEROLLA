package model;

import lombok.Data;

@Data
public class Skill {
    private String SkillName;
    private String SkillType;
    private String SkillText;
    private String SkillSTATDependency;
    private String SkillActionCost;
    private String SkillCost;
    private String SkillCooldown;
    private String SkillEffect;

}
