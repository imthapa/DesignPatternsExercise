package question4;

import question4.concreteStrategy.Lelvel1Fighter;
import question4.concreteStrategy.Level2Fighter;
import question4.context.StreetFighter;

/**
 * Suppose we are building a game “Street Fighter”. For simplicity assume that a character may have four moves
 * that is kick, punch, roll and jump. Every character has same kick and punch moves, but there would be
 * various pre-defined types of roll and jump (more types can be added in future), and these will change for
 * each fighter as it goes up the levels.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        StreetFighter fighterLevel1 = new Lelvel1Fighter();
        StreetFighter fighterLevel2 = new Level2Fighter();

        fighterLevel1.sayLevel();
        fighterLevel1.performJump();
        fighterLevel1.performRoll();
        fighterLevel1.kick();
        fighterLevel1.punch();

        System.out.println();

        fighterLevel2.sayLevel();
        fighterLevel2.performJump();
        fighterLevel2.performRoll();
        fighterLevel2.kick();
        fighterLevel2.punch();

    }
}
