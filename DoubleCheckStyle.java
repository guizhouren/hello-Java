package MySingleDemo;
//����ģʽ
//˫�ؼ��鷨
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
