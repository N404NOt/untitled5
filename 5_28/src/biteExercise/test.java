package biteExercise;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-28
 * Time: 18:26
 */
public class test {
        public static boolean isAdmin(String userId){
            return userId.toLowerCase()=="admin";
        }
        public static void main(String[] args){
            System.out.println(isAdmin("Admin"));
        }
}
