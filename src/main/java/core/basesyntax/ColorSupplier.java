package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] Colors = {
            "red", "green", "blue", "yellow", "black", "orange", "purple", "pink"
    };
    private Random random = new Random();

    public String getRandomColor() {
        return Colors[random.nextInt(Colors.length)];
    }
}
