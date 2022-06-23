package any;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-23
 * Time: 13:22
 */
//输入航班号，查询起降时间，起飞抵达城市，航班票价，票价折扣，确定航班是否满仓
public class Message {
    private String classs;
    private String starTime;
    private String startCity;

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    private String city;
    private String endTime;
    private double price;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    double discount;
    boolean isFull;

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        this.isFull = full;
    }

    @Override
    public String toString() {
        return "            {" +
                "classs='" + classs + '\'' +
                ", starTime='" + starTime + '\'' +
                ", startCity='" + startCity + '\'' +
                ", city='" + city + '\'' +
                ", endTime='" + endTime + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", isFull=" + isFull +
                '}';
    }
}
