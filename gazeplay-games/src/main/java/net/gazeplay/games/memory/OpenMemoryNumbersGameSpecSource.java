package net.gazeplay.games.memory;

import net.gazeplay.GameCategories;
import net.gazeplay.GameSpec;
import net.gazeplay.GameSpecSource;
import net.gazeplay.GameSummary;

public class OpenMemoryNumbersGameSpecSource implements GameSpecSource {
    @Override
    public GameSpec getGameSpec() {
        return new GameSpec(
            GameSummary.builder().nameCode("OpenMemoryNumbers").gameThumbnail("data/Thumbnails/openMemoryNumbers.png").category(GameCategories.Category.ACTION_REACTION).build(),
            new MemoryGameVariantGenerator(), new OpenMemoryNumbersGameLauncher());
    }
}