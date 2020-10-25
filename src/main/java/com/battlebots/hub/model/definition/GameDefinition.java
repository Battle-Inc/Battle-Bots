package com.battlebots.hub.model.definition;

public interface GameDefinition<T extends TurnModel> {

    String getId();

    String getName();

    String getVersion();

    TurnManager<T> getTurnManager();
}
