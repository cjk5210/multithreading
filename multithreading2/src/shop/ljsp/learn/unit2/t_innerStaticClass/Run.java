package shop.ljsp.learn.unit2.t_innerStaticClass;

public class Run {
    public static void main(String[] args) {
        PublicClass publicClass=new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername()+" "
            + publicClass.getPassword());
        PublicClass.PrivateClass privateClass=new PublicClass.PrivateClass();
    }
}
