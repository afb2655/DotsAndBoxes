package game;

/**
 * This class is an enumeration for representing the players in the Dots And
 * Boxes game.  Here is an example of how you can use this enum in another
 * class:
 *
 * game.Player player = game.Player.RED;        // player is Red
 * if (player == game.Player.Red) {
 *     System.out.println(player);              // Prints: RED
 *     System.out.println(player.getLabel());   // Prints: R
 * }
 * player = game.Player.BLUE;                   // player is now Blue
 *
 * @author Sean Strout @ RIT CS
 */
public enum Player {
    RED("R"),           // Red player is: R
    BLUE("B"),          // Blue player is: B
    NONE(" ");          // If no player is specified it is a space

    /** the label associated with the player */
    private String label;

    /**
     * Create the player with the label . This should not get called directly by the
     * user - it happens implicitly when the definitions above are read in.
     *
     * @param label the label for the player
     */
    Player(String label) {
        this.label = label;
    }

    /**
     * Get the player's label.
     *
     * @return the string label
     */
    public String getLabel() {
        return this.label;
    }
}