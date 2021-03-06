import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik cat1 = new Kotik(3, "barsik", 3, "meeeeeeew");

        Kotik cat2 = new Kotik();
        cat2.setKotik(1, "Vasya", 5, "me");

        System.out.println("Cat " + cat1.getName() + " weighs " + cat1.getWeigh());
        cat1.liveAnotherDay();

        cat1.compareMeow(cat1, cat2);

        System.out.println(cat1.getCount() + " cats was created");
    }
}
