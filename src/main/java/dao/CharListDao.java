package dao;

import model.CharList;

public interface CharListDao {
    void addCharList();

    void removeCharList();

    CharList readCharList();

    void updateCharList();
}
