package poker;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-13
 * Time: 14:53
 */
public class Poker {
    public int rank;//牌值
    public String suit;//花色

    @Override
    public String toString() {
        return String.format("[%s %d]",suit,rank);
    }
}
