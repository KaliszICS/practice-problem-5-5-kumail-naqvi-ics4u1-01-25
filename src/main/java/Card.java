import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card> {
    private String name; 
    private String suit;
    private static final Map<String, Integer> RANK_ORDER = new HashMap<>();
    private static final Map<String, Integer> SUIT_ORDER = new HashMap<>();

    static {
        // Ace -> King
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        for (int i = 0; i < ranks.length; i++) {
            RANK_ORDER.put(ranks[i], i);
        }
        String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
        for (int i = 0; i < suits.length; i++) {
            SUIT_ORDER.put(suits[i], i);
        }
    }

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String getName() { 
        return name; 
    }
    public String getSuit() { 
        return suit; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public void setSuit(String suit) { 
        this.suit = suit; 
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
    @Override
    public int compareTo(Card other) {
        int thisRank = RANK_ORDER.getOrDefault(this.name, Integer.MAX_VALUE);
        int otherRank = RANK_ORDER.getOrDefault(other.name, Integer.MAX_VALUE);
        if (thisRank != otherRank) {
            return Integer.compare(thisRank, otherRank);
        }
        int thisSuit = SUIT_ORDER.getOrDefault(this.suit, Integer.MAX_VALUE);
        int otherSuit = SUIT_ORDER.getOrDefault(other.suit, Integer.MAX_VALUE);
        return Integer.compare(thisSuit, otherSuit);
    }
}