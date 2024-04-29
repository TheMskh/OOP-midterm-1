package midterm.giorgi_meskhia_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // Change studentName to your name
    private String GiorgiMeskhia = "GiorgiMeskhia";

    @Override
    public String getJacket1() {
        // Implementing method from AbstractFantasy
        return "FantasyJacket";
    }

    @Override
    public String getPad2() {
        // Implementing method from AbstractFantasy
        return "FantasyPad";
    }

    @Override
    public String methodSkirt3(String argLed5) {
        // Implementing method from Dream interface
        return "Skirt" + argLed5;
    }

    @Override
    public List<String> methodTelescope4(String argPlanning6) {
        // Implementing method from Dream interface
        List<String> result = new ArrayList<>();
        result.add("Telescope" + argPlanning6);
        return result;
    }

    @Override
    public String toString() {
        // Implementing toString method
        return "Fantasy by " + GiorgiMeskhia;
    }
}

