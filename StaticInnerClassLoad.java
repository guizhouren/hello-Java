package MySingleDemo;
//��̬�ڲ������,�̰߳�ȫ
public class StaticInnerClassLoad {

    private static class staHolder{
        private static StaticInnerClassLoad instance=new StaticInnerClassLoad();
    }

    private StaticInnerClassLoad(){
        System.out.println("������װ��");
    }

    public static StaticInnerClassLoad getInstance(){
        return staHolder.instance;
    }
}
//ʹ���ڲ���ĺô��ǣ���̬�ڲ��಻���ڵ�������ʱ�ͼ��أ�
// �����ڵ���getInstance()����ʱ�Ž��м��أ��ﵽ����������ģʽ��Ч����
// �����ַ��������̰߳�ȫ�ġ�