package org.waaagh.service;

import org.waaagh.model.CharList;

public interface CharListService {
    void addCharList(CharList charList);

    void removeCharList(Long id);

    void updateCharList(CharList charList);

    CharList getCharListById(Long id);
}
