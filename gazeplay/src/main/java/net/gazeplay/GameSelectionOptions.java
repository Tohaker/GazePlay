package net.gazeplay;

import lombok.Data;
import picocli.CommandLine;

@Data
public class GameSelectionOptions {

    @CommandLine.Option(names = {"-g", "--game"})
    private String gameNameCode;

    @CommandLine.Option(names = {"--randomGame"}, defaultValue = "false")
    private boolean randomGame;

}
