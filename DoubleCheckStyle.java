package MySingleDemo;
//单列模式
//双重检验法
public class DoubleCheckStyle {
    private static DoubleCheckStyle instance;

    private DoubleCheckStyle(){

    }

    public static DoubleCheckStyle getInstance() {
        if (instance==null){
            synchronized (DoubleCheckStyle.class){
                if(instance==null){
                    instance=new DoubleCheckStyle();
                }

            }
        }
        return instance;
    }
}
