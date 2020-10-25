package com.battlebots.hub.model;

import java.util.Set;

public interface Lobby {

    String getId();

    LobbyState getState();

    Set<Participant> getParticipants();
}
