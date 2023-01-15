package org.waaagh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.waaagh.model.CharList;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharListRepository extends JpaRepository<CharList, Integer> {
    List<CharList> findAll();
    Optional<CharList> findById(Long id);
}
