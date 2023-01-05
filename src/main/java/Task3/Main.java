package Task3;

public class Main {
    public static void main(String[] args) {
        MyImage image = new ProxyImage("icon.png");
        image.display();
        image.display();
    }
}
