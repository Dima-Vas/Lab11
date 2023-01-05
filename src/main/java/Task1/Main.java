package Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user = User.builder()
                .name("N")
                .age(12)
                .gender(Gender.MALE)
                .build();
        System.out.println(user);
    }
}