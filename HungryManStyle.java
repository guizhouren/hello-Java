package MySingleDemo;
//����ģʽ
//����ģʽ ֱ������װ�ص�ʱ�򣬴�����ʵ��
public class HungryManStyle {
    private static  HungryManStyle instance=new HungryManStyle();

    private HungryManStyle(){

    }

    public static HungryManStyle getInstance() {
        return instance;
    }
}
