import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by cerebro on 03/07/15.
 */
public class PlayingCard extends Canvas {
    private String suit;
    private String value;

    private static final String[] suits = {"clubs", "spades", "diamonds", "hearts"};
    private static final String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public PlayingCard(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.setSize(300, 500);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //if else to figure out which color to choose
        g.setColor(Color.green);

        //draw actual card
        g.fillRect(0,0,300,500);

        g.setColor(Color.red);
        g.drawString(value + " of " + suit, 10, 50);
    }


    public static List<PlayingCard> deck() {
        Stack<PlayingCard> deck = new Stack<PlayingCard>();
        PlayingCard card;

        for (String suit:suits) {
            for(String value:values) {
                card = new PlayingCard(suit, value);
                deck.push(card);
            }
        }

        return deck;
    }
}
