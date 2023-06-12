public class Main {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("Подписчик 1");
        Subscriber subscriber2 = new Subscriber("Подписчик 2");

        Group group1 = new Group("группа 1");
        Group group2 = new Group("группа 2");
        Group group3 = new Group("группа 3");
        Group group4 = new Group("группа 4");

        group1.registerObserver(subscriber1);
        group2.registerObserver(subscriber1);
        group3.registerObserver(subscriber1);
        group4.registerObserver(subscriber1);

        group1.registerObserver(subscriber2);
        group2.registerObserver(subscriber2);
        group3.registerObserver(subscriber2);
        group4.registerObserver(subscriber2);

        group4.unregisterObserver(subscriber2);

        group1.notifyObservers("оповещение от группы 1" + "\n");
        group2.notifyObservers("оповещение от группы 2" + "\n");
        group3.notifyObservers("оповещение от группы 3" + "\n");
        group4.notifyObservers("оповещение от группы 4" + "\n");
    }
}