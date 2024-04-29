package task3;

import java.util.ArrayList;
import java.util.List;

public class DanceClass {
    private List<Dance> repertoire = new ArrayList<>();

    public void addDance(Dance dance) {
        repertoire.add(dance);
    }

    public boolean removeDance(Dance dance) {
        return repertoire.remove(dance);
    }

    public void printRepertoire() {
        if (repertoire.isEmpty()) {
            System.out.println("The repertoire is empty");
        } else {
            for (Dance d : repertoire) {
                System.out.println(d.getName());
                System.out.println("Style: " + d.getStyle());
                System.out.println("Region: " + d.getRegion());
                System.out.println();
            }
        }
    }
}
