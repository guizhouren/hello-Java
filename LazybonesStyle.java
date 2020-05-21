package MySingleDemo;
//单列模式
  //懒汉模式(线程不安全)
public class LazybonesStyle {
    private static LazybonesStyle instance;   //声明该实列

    private  LazybonesStyle(){


    }

    //对外提供该实列
    public static LazybonesStyle getInstance() {
        if (instance==null){     //如果多线程访问·,容易创建多个对象
            instance=new LazybonesStyle();
        }
        return instance;
    }
}
