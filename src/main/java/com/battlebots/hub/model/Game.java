package com.battlebots.hub.model;

import com.battlebots.hub.model.definition.GameDefinition;
import com.battlebots.hub.model.definition.TurnModel;

import java.util.Set;

public interface Game<T extends TurnModel> {

    GameDefinition<T> getGameDefinition();

    Set<Lobby> getLobbies();
}
