package com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.simpleFactory;

import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Backgrounds;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.Level;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.Terrain;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.OffroadCar;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.SportCar;
import com.github.Ukasz09.designPatternsExamples.creationalPatterns.factories.levelAssets.levelAssets.cars.VWGolf;

public class NormalLevelCreator implements ILevelCreator {
    @Override
    public Level createLevel(Terrain terrain) {
        switch (terrain) {
            case ASPHALT:
                return new Level(new SportCar(), Backgrounds.CARTING_SPORT_STADION);
            case FORREST_MUD:
                return new Level(new OffroadCar(), Backgrounds.FORREST_BACKGROUND);
            default:
                return new Level(new VWGolf(), Backgrounds.TUMIDAJ_VILLAGE);
        }
    }
}
