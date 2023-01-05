package Task3;

class ProxyImage implements MyImage {
    private final String filename;
    private RealImage image;
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(filename);
            System.out.println("New image loaded");
        }
        else {
            System.out.println("Cached image loaded");
        }
        image.display();
    }
}

