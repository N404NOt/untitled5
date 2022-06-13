package poker;

import java.util.ArrayList;

import static poker.playPoker.PlayersNumber;
import static poker.playPoker.Cardsnumbers;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-13
 * Time: 16:03
 */
public class Game {
    public static ArrayList<ArrayList<Poker>>  boomGoldFlower(ArrayList<Poker> pokers) {
        ArrayList<ArrayList<Poker>> players=new ArrayList<>(PlayersNumber);
        ArrayList<Poker> pokers1=new ArrayList<>();
        ArrayList<Poker> pokers2=new ArrayList<>();
        ArrayList<Poker> pokers3=new ArrayList<>();
        ArrayList<Poker> pokers4=new ArrayList<>();
        ArrayList<Poker> pokers5=new ArrayList<>();
        players.add(pokers1);
        players.add(pokers2);
        players.add(pokers3);
        players.add(pokers4);
        players.add(pokers5);
        ArrayList<Poker> temp;
        int k=0;
        for (int j = 0; j < Cardsnumbers; j++) {
            for (int i = 0; i < 5; i++) {
                temp=players.get(i);
                temp.add(pokers.get(k++));
            }
        }
        return players;
        /*public static void umpire() {

        }*/


    }
}
