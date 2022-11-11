package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final HumanPlayer player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = (HumanPlayer) player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }


    private boolean nextRound() {
        long m = player.askNextGuess();

        logger.log("Player entered " + String.format("%d",m)  + " result:");
        if (m == numberToGuess){
            logger.log("Win");
            return true;
        }
        if (m < numberToGuess){
            logger.log("Greater");
            System.out.println("Plus grand !");
        }
        if (m > numberToGuess){
            logger.log("Lower");
            System.out.println("Plus Petit !");
        }


        return false;
    }

    public void loopUntilPlayerSucceed() {
        logger.log("New game !");
        int n = 0;
        logger.log("Chosen number: " + numberToGuess);
        while (!nextRound()){
            logger.log("Round n" + n);
            n += 1;
        }

    }
}
