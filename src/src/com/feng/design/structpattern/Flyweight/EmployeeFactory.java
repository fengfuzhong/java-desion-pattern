package src.com.feng.design.structpattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

/*享元模式
享元模式从对象中剥离出不发生改变且多个实例需要的重复数据，独立出一个享元，使多个对象共享，从而节省内存以及减少对象数量。
用通俗的大白话来说就是减少对象的数量，提高对象的利用率，减少内存的使用，提高系统性能。
享元模式使用一个工厂类，在工厂类中为每种类型创建一个对象，而且每种类型的对象只有一个
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String,Employee>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理:"+department);
            String reportContent = department+"部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:"+reportContent);
            EMPLOYEE_MAP.put(department,manager);

        }
        return manager;
    }

}

