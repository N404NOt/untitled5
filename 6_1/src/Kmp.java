/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-01
 * Time: 16:59
 */
public class Kmp {
    public static void getNext(String sub,int[] next) {
        next[0]=-1;
        next[1]=0;
        int k=0;
        int i=2;
        int subLength=sub.length();
        while(i<subLength) {
            if(k==-1||sub.charAt(i-1)==sub.charAt(k)) {
                next[i]=k+1;
                i++;
                k++;
            } else {
                k=next[k];
            }
        }
      /*  for (; i < subLength; i++) {
            if(k==-1||sub.charAt(i-1)==sub.charAt(k)) {
                next[i]=k+1;
                i++;
                k++;
            } else {
                k=next[k];
            }

        }*/

    }
    public static int KMP(String str,String sub,int pos) {
        int strLength=str.length();
        int subLength=sub.length();
        if(subLength>strLength-pos) return -1;
        int[] next=new int[subLength];
        getNext(sub,next);
        int i=pos;
        int j=0;
        while(i<strLength&&j<subLength) {
            if(j==-1||str.charAt(i)==sub.charAt(j)) {
                i++;
                j++;
            } else {
                j=next[j];

            }
        }
        if(subLength==j) {
            return i-j;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="asdfabcaefre";
        String sub="abcae";
        int pos=KMP(str,sub,0);
        System.out.println(pos);

    }
}
