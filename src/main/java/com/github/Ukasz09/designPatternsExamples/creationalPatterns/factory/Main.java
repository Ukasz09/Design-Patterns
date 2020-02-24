package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelAssets.Terrain;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelFactory.ForrestCreator;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelFactory.LevelCreator;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelFactory.SportStadiumCreator;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factory.levelFactory.VillageCreator;

public class Main {
    public static void main(String[] args) {
        LevelCreator levelCreator = getLevelCreator(Terrain.ASPHALT);
        levelCreator.createLevel().showLevelInfo();

        levelCreator = getLevelCreator(Terrain.FORREST_MUD);
        levelCreator.createLevel().showLevelInfo();

        levelCreator = getLevelCreator(Terrain.CRUSHED_STONE);
        levelCreator.createLevel().showLevelInfo();
    }

    private static LevelCreator getLevelCreator(Terrain terrain) {
        switch (terrain) {
            case ASPHALT:
                return new SportStadiumCreator();
            case FORREST_MUD:
                return new ForrestCreator();
            default:
                return new VillageCreator();
        }
    }
}
