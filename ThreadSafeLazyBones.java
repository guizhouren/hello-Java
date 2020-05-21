package MySingleDemo;
//单列模式
//线程安全的懒汉模式
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
