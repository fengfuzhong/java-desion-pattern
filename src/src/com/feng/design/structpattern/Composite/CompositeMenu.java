package src.com.feng.design.structpattern.Composite;

import java.util.ArrayList;
import java.util.List;

/*组合模式是将存在某种包含关系的数据组织在一起，典型的例子就是树状结构。
例如菜单功能，一个菜单除了自己该有的属性，还可能包含子菜单，
创建的时候可以使用递归的方法。*/
public class CompositeMenu extends Menu {

    private List<Menu> componentArrayList = new ArrayList<Menu>();

    public CompositeMenu(String name, int type) {
        super(name,type);
    }
    public void add(Menu component) {
        componentArrayList.add(component);

    }

    public void remove(Menu component) {
        componentArrayList.remove(component);
    }

    public void display(int depth) {
        //输出树形结构
        for(int i=0; i<depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);
        //下级遍历
        for (Menu component : componentArrayList) {
            component.display(depth + 1);
        }
    }
}
