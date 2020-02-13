import java.util.ArrayList;
public class Deck {

    private ArrayList<Card> cards;
    private SuitType suit;
    private RankType rank;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }


    public int cardCount() {
        return this.cards.size();
    }

    public void addCard(Card cardGame){
        this.cards.add(cardGame);
    }

    public void populate() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {

            }
        }
    }
}
