package com.battlebots.hub.model;

import java.util.Set;

public interface Hub {

    Set<Game> getGames();

    void addGame(Game game);

}
