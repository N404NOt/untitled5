import demo1.OuterClass;

public class TestDemo1 {
    public static void main(String[] args) {
        OuterClass outerclass=new OuterClass();
        System.out.println(outerclass);
        //System.out.println(outerclass.data3);
       // System.out.println(outerclass.data6);
    }
    public static void main1(String[] args) {
        Dog dog1=new Dog();
        dog1.name="大黄";
        dog1.heavy=20;
        Dog.high=6;
        dog1.setAge(21);
        System.out.println(dog1.getAge());
        dog1.bark();
        System.out.println(dog1);
        System.out.println(dog1.toString());

    }
}
