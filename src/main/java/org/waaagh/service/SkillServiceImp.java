package org.waaagh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.waaagh.model.Skill;
import org.waaagh.repositories.SkillsRepository;

@Service
public class SkillServiceImp implements SkillService {

    private final SkillsRepository repository;

    @Autowired
    public SkillServiceImp(SkillsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addSkill(Skill skill) {
        repository.save(skill);
    }

    @Override
    public void removeSkill(String skillName) {
        repository.delete(getSkillByName(skillName));
    }

    @Override
    public void updateSkill(Skill skill) {
        repository.save(skill);
    }

    @Override
    public Skill getSkillByName(String skillName) {
        return repository.getById(skillName);
    }
}
