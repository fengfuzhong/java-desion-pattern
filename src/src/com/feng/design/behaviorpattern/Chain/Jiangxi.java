package src.com.feng.design.behaviorpattern.Chain;

public class Jiangxi extends AbstractAction{
    private static final String type="江西";
    @Override
    public void todo(String type) {
        if(this.type.equals(type)){
            System.out.println("我是江西处理中心,我只处理江西的业  务");
        }else{
            Action action = this.getAction();

            if (action != null) {
                action.todo(type);
            }else{
                super.todo(type);
            }
        }
    }
}