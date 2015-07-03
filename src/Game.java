import java.util.Collections;
import java.util.Stack;

/**
 * Created by cerebro on 03/07/15.
 */
public class Game {
    Stack<PlayingCard> p1OpenCards;
    Stack<PlayingCard> p2OpenCards;

    Stack<PlayingCard> p1ClosedCards;
    Stack<PlayingCard> p2ClosedCards;


    public Game(Window window) {
        Stack<PlayingCard> allCards = (Stack<PlayingCard>)PlayingCard.deck();

        Collections.shuffle(allCards);

        //code to distrubute the cards.

        window.openCardPanel1.add(allCards.pop());
        window.openCardPanel2.add(allCards.pop());




    }
}
