package extthread;

public class Run {
    public static void main(String[] args) {
    //    for (int i = 0; i < 100; i++) {
            ALogin a = new ALogin();
            a.start();
            BLogin b = new BLogin();
            b.start();
    //    }
    }
}
