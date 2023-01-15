package org.waaagh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.waaagh.model.Skill;

import java.util.List;
import java.util.Optional;

@Repository
public interface SkillsRepository extends JpaRepository<Skill, String> {
    List<Skill> findAll();
    Optional<Skill> findById(String skillName);
}
