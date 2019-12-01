package com.brunoyam.unit_2.service.IO;

import com.brunoyam.unit_2.models.BattleField;

public interface BattleFieldIO {
    BattleField read();
    void write(BattleField battleField);
}
