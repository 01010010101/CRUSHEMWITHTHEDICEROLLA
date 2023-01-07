package service;

import model.CharList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.CharListRepository;

import java.util.Optional;

@Service
public class CharListServiceImp implements CharListService {
    private final CharListRepository repository;

    @Autowired
    public CharListServiceImp(CharListRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public void addCharList(CharList charList) {
        charList.setId(null);
        repository.save(charList);
    }

    @Override
    @Transactional
    public void removeCharList(Integer id) {
        repository.delete(getCharListById(id));
    }

    @Override
    @Transactional
    public void updateCharList(CharList charList) {
        repository.save(charList);
    }

    @Override
    public CharList getCharListById(Integer id) {
        Optional<CharList> findChar = repository.findById(id);
        return findChar.orElse(null);
    }
}
