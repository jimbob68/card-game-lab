import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardGameTest{

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void checkDeckIsEmpty(){
        deck.cardCount();
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canAddCard(){
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }
    @Test
    public void checkDeckHasFiftyTwoCards(){
        card.populate();
        assertEquals(52,deck.cardCount());

    }



}