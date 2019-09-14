package src.com.feng.design.behaviorpattern.Chain;


public class ChainTest {
    public static void main(String[] args) {
        //当我们的type为"广东"时,前面的type匹配不上的时候,就会依次向后传递任务,
        // 直到有一个对象可以处理.
        String type = "广东";
        Hunan hunan=new Hunan();
        Hubei hubei = new Hubei();
        Jiangxi jiangxi = new Jiangxi();
        Guangdong guangdong = new Guangdong();

        hunan.setAction(hubei);
        hubei.setAction(jiangxi);
        jiangxi.setAction(guangdong);
        guangdong.setAction(null);

        hunan.todo(type);
    }
}
