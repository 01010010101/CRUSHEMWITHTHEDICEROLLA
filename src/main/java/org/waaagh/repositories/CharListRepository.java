package org.waaagh.repositories;

import org.springframework.data.jpa.repository.Query;
import org.waaagh.model.CharList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharListRepository extends JpaRepository<CharList, Integer> {
//    @Query("SELECT v FROM Visit v WHERE v.visitType='NEW'")
    List<CharList> findAll();

    Optional<CharList> findById(Integer id);
}
