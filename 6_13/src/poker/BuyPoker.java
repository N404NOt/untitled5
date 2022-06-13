package poker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-13
 * Time: 14:58
 */
class BuyPoker {
   /* public static final String[] SUITS = {"♠", "♥", "♣", "♦"};
    // 买一副牌
    private static ArrayList<Poker> buyDeck() {
        ArrayList<Poker> deck = new ArrayList<>(52);
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String suit = SUITS[i];
                int rank = j;
                Poker card = new Poker();
                card.rank = rank;
                card.suit = suit;
                deck.add(card);
            }
        }
        return deck;
    }*/

    public static String[] Suits= {"♥", "♠","♦","♣"};
    public static ArrayList<Poker> buyPoker() {
        ArrayList<Poker> Cards=new ArrayList<>(52);
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                String suit1=Suits[j];
                Poker poker=new Poker();
                poker.suit=suit1;
                poker.rank=i;
                Cards.add(poker);
            }
        }
        System.out.println("徐凯买了一副牌并且打开了这副牌");
        return Cards;
    }
    public ArrayList<Poker> getPoker() {
        return buyPoker();
    }

}
