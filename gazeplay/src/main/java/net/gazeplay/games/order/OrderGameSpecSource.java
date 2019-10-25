package net.gazeplay.games.order;

import net.gazeplay.GameCategories;
import net.gazeplay.GameSpec;
import net.gazeplay.GameSummary;
import net.gazeplay.gameslocator.GameSpecSource;

public class OrderGameSpecSource implements GameSpecSource {
    @Override
    public GameSpec getGameSpec() {
        return new GameSpec(
            GameSummary.builder().nameCode("Order").gameThumbnail("data/Thumbnails/ordre.png").category(GameCategories.Category.MEMORIZATION).build(),
            new OrdersGameVariantGenerator(), new OrderGameLauncher());
    }
}