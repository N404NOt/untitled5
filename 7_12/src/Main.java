import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      while(sc.hasNext()){
            String str=sc.nextLine();
            StringBuffer sb=new StringBuffer();
            for (int i = 0; i <str.length() ; i++) {
                char tmp=str.charAt(i);
                if(!sb.toString().contains(tmp+"")){
                    sb.append(tmp);
                }
            }
            System.out.println(sb.toString());
      }
    }
}