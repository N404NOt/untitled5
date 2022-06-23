package any;

import MyArrayList.MyArrayList;
import any.Message;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-23
 * Time: 13:17
 */
////输入航班号，查询起降时间，起飞抵达城市，航班票价，票价折扣，确定航班是否满仓
public class Test {
    public static void main(String[] args) {
        Message message=new Message();
        message.setClasss("HW325");
        message.setStarTime("8:35");
        message.setEndTime("17:58");
        message.setStarTime("上海");
        message.setCity("纽约");
        message.setPrice(678.9);
        message.setDiscount(0.95);
        System.out.println(message);
        MyArrayList myArrayList=new MyArrayList();
        System.out.println(myArrayList.size());
        myArrayList.add(message);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.getElementdate(0));
        myArrayList.

    }
}
