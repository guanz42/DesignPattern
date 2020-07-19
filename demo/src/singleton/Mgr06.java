package singleton;

/**
 * 懒加载
 * synchronized解决多线程问题，但效率降低
 */
public class Mgr06 {

    private static volatile Mgr06 INSTANCE; // 需要加上 volatile 修饰

    private Mgr06() {
    }

    public static Mgr06 getInstance() {
        if (INSTANCE == null) {
            // 双重检测
            synchronized (Mgr06.class) {
                if (INSTANCE == null) {
                    // 多线程测试
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr06.getInstance().hashCode())
            ).start();
        }
    }
}
