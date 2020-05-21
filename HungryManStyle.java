package MySingleDemo;
//单列模式
//饿汉模式 直接在类装载的时候，创建该实列
public class HungryManStyle {
    private static  HungryManStyle instance=new HungryManStyle();

    private HungryManStyle(){

    }

    public static HungryManStyle getInstance() {
        return instance;
    }
}
