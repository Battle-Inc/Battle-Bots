package com.battlebots.hub.model;

import java.util.Set;

public interface Game {

    String getId();

    String getName();

    String getVersion();

    Set<Lobby> getLobbies();
}
