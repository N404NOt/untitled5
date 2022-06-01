/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-01
 * Time: 15:44
 */
public class bf {
    public static int BF(String str,String sub,int pos) {
        int strLength=str.length();
        int subLength=sub.length();
        if(subLength>strLength-pos) {
            return -1;
        }
        int i=pos,j=0;
        while(i<strLength && j<subLength) {
            if(str.charAt(i)==sub.charAt(j)) {
                i++;
                j++;
            } else {
                i=i-j+1;
                j=0;
            }

        }
        if(subLength==j) {
            return i-j;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="asdffre";
        String sub="ffr";
        int place=BF(str,sub,0);
        System.out.println(place);

    }
}
