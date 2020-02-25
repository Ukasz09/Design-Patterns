package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.factoryMethod;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.Level;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Terrain;

public abstract class LevelProcessing {
    public void startNewLevel(Terrain terrain) {
        Level level = createLevel(terrain);
        level.showLevelInfo();
        level.startAnimations();
    }

    protected abstract Level createLevel(Terrain terrain);
}
