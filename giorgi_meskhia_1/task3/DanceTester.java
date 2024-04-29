package task3;

public class DanceTester {
    public static void main(String[] args) {
        Dance d1 = new Dance();
        d1.setName("Kartuli");
        d1.setStyle("Folk Dance");
        d1.setRegion("Kartli");

        Dance d2 = new Dance();
        d2.setName("Acharuli");
        d2.setStyle("Solo Dance");
        d2.setRegion("Adjara");

        DanceClass danceClass = new DanceClass();
        danceClass.addDance(d1);
        danceClass.addDance(d2);
        danceClass.removeDance(d1);
        danceClass.printRepertoire();
    }
}
