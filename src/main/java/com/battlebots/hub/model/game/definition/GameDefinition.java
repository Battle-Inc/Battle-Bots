package com.battlebots.hub.model.game.definition;

public interface GameDefinition<T extends TurnModel> {

    String getId();

    String getName();

    String getVersion();

    TurnManager<T> getTurnManager();
}
