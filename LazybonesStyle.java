package MySingleDemo;
//����ģʽ
  //����ģʽ(�̲߳���ȫ)
public class LazybonesStyle {
    private static LazybonesStyle instance;   //������ʵ��

    private  LazybonesStyle(){


    }

    //�����ṩ��ʵ��
    public static LazybonesStyle getInstance() {
        if (instance==null){     //������̷߳��ʡ�,���״����������
            instance=new LazybonesStyle();
        }
        return instance;
    }
}
