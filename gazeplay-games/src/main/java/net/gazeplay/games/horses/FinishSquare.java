package net.gazeplay.games.horses;


import net.gazeplay.components.Position;

public class FinishSquare extends Square {

    public FinishSquare(Position pawnPosition, Horses game) {
        super(pawnPosition, game);
    }

    @Override
    public void pawnLands(Pawn pawn) {
        game.win(pawn);
    }
}
