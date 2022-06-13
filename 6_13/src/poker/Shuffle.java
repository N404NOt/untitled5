package poker;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-13
 * Time: 15:42
 */
class Swap {


}
public class Shuffle {
    private static void swap(ArrayList<Poker> Cards,int i,int index) {
        Poker poker=Cards.get(i);
        Cards.set(i,Cards.get(index));
        Cards.set(index,poker);
    }
    public static void swap(ArrayList<Poker> Cards) {
        Random random=new Random();
        int index;
        for (int i = Cards.size()-1; i >0 ; i--) {
            index=random.nextInt(i);
            swap(Cards,i,index);
        }
    }
}
