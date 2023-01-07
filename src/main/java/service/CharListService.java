package service;

import model.CharList;

public interface CharListService {
    void addCharList(CharList charList);

    void removeCharList(Integer id);

    void updateCharList(CharList charList);

    CharList getCharListById(Integer id);
}
