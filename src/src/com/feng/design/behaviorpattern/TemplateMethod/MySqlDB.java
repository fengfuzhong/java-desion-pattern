package src.com.feng.design.behaviorpattern.TemplateMethod;

public class MySqlDB extends DBTemplate {

    @Override
    public void open() {
        System.out.println("新建一个mysql连接");
    }

    @Override
    public void select() {
        System.out.println("查询mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql连接");
    }


    public static void main(String[] args) {
        DBTemplate mysqlDB = new MySqlDB();
        mysqlDB.selectTemplate();
    }
}
