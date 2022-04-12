package KB;

public class UserDriver {
    public static void main(String[] args){
        User user1 = new User("cse20-018", "@BakangMonei959115515");
        System.out.println("User 1 info: " + "\n" + user1.getVerifyCredentials());
    }
}