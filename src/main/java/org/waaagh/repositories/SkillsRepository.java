package org.waaagh.repositories;

import org.springframework.data.jpa.repository.Query;
import org.waaagh.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SkillsRepository extends JpaRepository<Skill, String> {
//    @Query("SELECT v FROM skills v WHERE v.visitType='NEW'")
    List<Skill> findAll();

    Optional<Skill> findById(String skillName);
}
