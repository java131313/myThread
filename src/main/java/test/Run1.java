package test;

import myrunnable.MyRunnbale;

public class Run1 {
    public static void main(String[] args) {
        MyRunnbale ru = new MyRunnbale();
        Thread thread = new Thread(ru);
        thread.start();
        System.out.println("运行结束！");
    }
}
