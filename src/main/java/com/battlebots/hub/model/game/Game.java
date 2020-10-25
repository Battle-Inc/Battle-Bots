package com.battlebots.hub.model.game;

import com.battlebots.hub.model.Participant;
import com.battlebots.hub.model.game.definition.GameDefinition;
import com.battlebots.hub.model.game.definition.TurnModel;

import java.util.Set;

public interface Game<T extends TurnModel> {

    GameState getState();

    GameDefinition<T> getGameDefinition();

    void subscribe(Participant participant);

    Set<Participant> getParticipants();
}
