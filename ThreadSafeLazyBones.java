package MySingleDemo;
//����ģʽ
//�̰߳�ȫ������ģʽ
public class ThreadSafeLazyBones {
     private static ThreadSafeLazyBones instance;
     private ThreadSafeLazyBones(){


     }

    public static synchronized ThreadSafeLazyBones getInstance() {
        if (instance==null){
            instance=new ThreadSafeLazyBones();

        }
         return instance;
    }
}
