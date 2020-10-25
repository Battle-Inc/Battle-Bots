package com.battlebots.hub.model.game;

import java.util.Set;

public interface GameProvider {

    /**
     * All 'playable' games (in wait, ongoing).
     *
     * @return
     */
    Set<Game> getGames();
}
