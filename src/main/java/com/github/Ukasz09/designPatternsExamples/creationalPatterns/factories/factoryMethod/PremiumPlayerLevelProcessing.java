package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.factoryMethod;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.Level;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Terrain;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.OffroadCar;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.SportCar;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.VWGolf;

public class PremiumPlayerLevelProcessing extends LevelProcessing {
    @Override
    protected Level createLevel(Terrain terrain) {
        switch (terrain) {
            case ASPHALT: {
                Level level = new Level(new SportCar(), Backgrounds.CARTING_SPORT_STADION);
                level.activateAllBonuses();
                return level;
            }
            case FORREST_MUD: {
                Level level = new Level(new OffroadCar(), Backgrounds.FORREST_BACKGROUND);
                level.activateAllBonuses();
                level.activateHiddenPassage();
                return level;
            }

            default: {
                Level level = new Level(new VWGolf(), Backgrounds.TUMIDAJ_VILLAGE);
                level.activateHiddenPassage();
                return level;
            }
        }
    }
}
