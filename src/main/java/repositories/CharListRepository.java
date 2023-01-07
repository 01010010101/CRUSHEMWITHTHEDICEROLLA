package repositories;

import model.CharList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharListRepository extends JpaRepository<CharList, Integer> {
    List<CharList> findAll();

    Optional<CharList> findById(Integer id);
}
