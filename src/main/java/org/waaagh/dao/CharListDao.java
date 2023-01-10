package org.waaagh.dao;

import org.waaagh.model.CharList;

public interface CharListDao {
    void addCharList();

    void removeCharList();

    CharList readCharList();

    void updateCharList();
}
