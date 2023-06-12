public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String notification) {
        System.out.println(name + ", " + notification);
    }
}
