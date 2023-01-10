package org.waaagh.service;

import org.waaagh.model.Skill;

public interface SkillService {
    void addSkill(Skill skill);

    void removeSkill(String skillName);

    void updateSkill(Skill skill);

    Skill getSkillByName(String skillName);
}
