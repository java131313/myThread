package t4.threadsafe.controller;

public class LoginServlet  {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username,String password){
        try {
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(3000);
            }
            passwordRef = password;
            System.out.println("username =  "+username+" password = "+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
