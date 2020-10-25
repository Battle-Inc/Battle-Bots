package com.battlebots.hub.model.game.definition;

public interface TurnManager<T extends TurnModel> {

    void doTurn(String participantId, T turnModel);

}
