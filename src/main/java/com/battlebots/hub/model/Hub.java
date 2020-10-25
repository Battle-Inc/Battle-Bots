package com.battlebots.hub.model;

import java.util.Set;

import com.battlebots.hub.model.game.Game;
import com.battlebots.hub.model.game.GameProvider;

public interface Hub {

    void addGameProvider(GameProvider gameProvider);

    /**
     * All {@link GameProvider}(s) games.
     *
     * @return
     */
    Set<Game> getGames();
}
