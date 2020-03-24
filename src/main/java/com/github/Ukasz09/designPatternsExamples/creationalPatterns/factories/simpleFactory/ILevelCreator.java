package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.simpleFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.Level;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Terrain;

public interface ILevelCreator {
    Level createLevel(Terrain terrain);
}
