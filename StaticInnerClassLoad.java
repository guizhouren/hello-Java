package MySingleDemo;
//静态内部类加载,线程安全
public class StaticInnerClassLoad {

    private static class staHolder{
        private static StaticInnerClassLoad instance=new StaticInnerClassLoad();
    }

    private StaticInnerClassLoad(){
        System.out.println("单列已装载");
    }

    public static StaticInnerClassLoad getInstance(){
        return staHolder.instance;
    }
}
//使用内部类的好处是，静态内部类不会在单例加载时就加载，
// 而是在调用getInstance()方法时才进行加载，达到了类似懒汉模式的效果，
// 而这种方法又是线程安全的。