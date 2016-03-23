/**
 * Created by bogdan on 23.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        User a = new User("Bogdan", "Kiev", 19);
        System.out.println(a);
        User b = new User("Bogdan", "Kiev", 19);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
