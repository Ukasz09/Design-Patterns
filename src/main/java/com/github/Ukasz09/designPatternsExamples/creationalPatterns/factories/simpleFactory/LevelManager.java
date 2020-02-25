package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.simpleFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.Level;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Terrain;

public class LevelManager {
    private ILevelCreator levelCreator;

    //----------------------------------------------------------------------------------------------------------------//
    public LevelManager(ILevelCreator levelCreator) {
        this.levelCreator = levelCreator;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void startNewLevel(Terrain terrain) {
        Level level = levelCreator.createLevel(terrain);
        level.showLevelInfo();
        level.startAnimations();
    }
}
