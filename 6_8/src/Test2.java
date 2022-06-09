/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-08
 * Time: 13:59
 */
class Message<T> {
    private T message ;
    public T getMessage() {
        return message;
    }
    public void setMessage(T message) {
        this.message = message;
    }
}
public class Test2 {
    public static void main(sing[] args) {
        Message<sing> message = new Message() ;
        message.setMessage("比特就业课欢迎您");
        fun(message);
        Message<Integer> message1=new Message<>();
        message1.setMessage(123);
        fun(message1);
    }
    public static void fun(Message<?> temp){
        System.out.println(temp.getMessage());
    }
}
