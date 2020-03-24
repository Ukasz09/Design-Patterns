package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.abstractFactory.ForrestLevel;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.abstractFactory.Level;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.abstractFactory.VillageLevel;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Terrain;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.factoryMethod.LevelProcessing;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.factoryMethod.NormalPlayerLevelProcessing;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.factoryMethod.PremiumPlayerLevelProcessing;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.simpleFactory.NormalLevelCreator;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.simpleFactory.LevelManager;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.simpleFactory.PremiumLevelCreator;

public class Main {
    public static void main(String[] args) {
        simpleFactoryPresentation();
        factoryMethodPresentation();
        abstractFactoryPresentation();
    }

    private static void simpleFactoryPresentation() {
        System.out.println("NORMAL PLAYER:\n");
        LevelManager normalPlayer = new LevelManager(new NormalLevelCreator());
        normalPlayer.startNewLevel(Terrain.ASPHALT);
        normalPlayer.startNewLevel(Terrain.CRUSHED_STONE);
        normalPlayer.startNewLevel(Terrain.FORREST_MUD);

        System.out.println("PREMIUM PLAYER:\n");
        LevelManager premiumPlayer = new LevelManager(new PremiumLevelCreator());
        premiumPlayer.startNewLevel(Terrain.ASPHALT);
        premiumPlayer.startNewLevel(Terrain.CRUSHED_STONE);
        premiumPlayer.startNewLevel(Terrain.FORREST_MUD);
    }

    private static void factoryMethodPresentation() {
        System.out.println("NORMAL PLAYER:\n");
        LevelProcessing normalPlayerLevel = new NormalPlayerLevelProcessing();
        normalPlayerLevel.startNewLevel(Terrain.ASPHALT);
        normalPlayerLevel.startNewLevel(Terrain.CRUSHED_STONE);
        normalPlayerLevel.startNewLevel(Terrain.FORREST_MUD);

        System.out.println("PREMIUM PLAYER:\n");
        LevelProcessing premiumPlayerLevel = new PremiumPlayerLevelProcessing();
        premiumPlayerLevel.startNewLevel(Terrain.ASPHALT);
        premiumPlayerLevel.startNewLevel(Terrain.CRUSHED_STONE);
        premiumPlayerLevel.startNewLevel(Terrain.FORREST_MUD);
    }

    private static void abstractFactoryPresentation() {
        Level level = new Level(1, new ForrestLevel());
        level.startLevel();
        level = new Level(2, new VillageLevel());
        level.startLevel();
    }
}
