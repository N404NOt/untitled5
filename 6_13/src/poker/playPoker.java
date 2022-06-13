package poker;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-13
 * Time: 14:49
 */

public class playPoker {
    public static final int PlayersNumber=5;
    public static final int Cardsnumbers=3;
    public static void main(String[] args) {
        ArrayList<Poker> Cards=new ArrayList<>();
        BuyPoker buyPoker=new BuyPoker();
        Cards= buyPoker.getPoker();
        System.out.println(Cards);
        //Shuffle shuffle=new Shuffle();
        Shuffle.swap(Cards);
        System.out.println("小凯子很专业的洗完了牌");
        System.out.println(Cards);
        System.out.println("辛劳的小凯子在线发牌");
        ArrayList<ArrayList<Poker>> players=new ArrayList<>(PlayersNumber);
        players=Game.boomGoldFlower(Cards);
        for (int i = 0; i < PlayersNumber; i++) {
            System.out.println("玩家"+i);
            System.out.println(players.get(i));
        }

    }
}
