package extthread;

import t4.threadsafe.controller.LoginServlet;

public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
