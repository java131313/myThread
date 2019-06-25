package extthread;

import t4.threadsafe.controller.LoginServlet;

public class ALogin extends Thread {
    @Override
    public void run() {

        LoginServlet.doPost("a","aa");
    }
}
