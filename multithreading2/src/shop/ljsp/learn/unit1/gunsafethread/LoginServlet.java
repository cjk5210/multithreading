package shop.ljsp.learn.unit1.gunsafethread;

public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
     public static void doPost(String username,String password){
        try {
            usernameRef=username;
            if(username.equals("a")){
                Thread.sleep(10000);
            }
            passwordRef=password;
            System.out.println("username="+usernameRef+" password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
