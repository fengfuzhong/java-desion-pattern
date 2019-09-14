package src.com.feng.design.behaviorpattern.Chain;

public class Hunan extends AbstractAction{
    private static final String type="湖南";
    @Override
    public void todo(String type) {
        if(this.type.equals(type)){
            System.out.println("我是湖南处理中心,我只处理湖南的业  务");
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
