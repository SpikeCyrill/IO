package com.brunoyam.unit_2.service;

import com.brunoyam.unit_2.models.BattleField;

public interface BattleFieldService {

    void startNegame(BattleField battleField);

    void calcNextMove(BattleField battleField);

    void getWinner(BattleField battleField);
}
