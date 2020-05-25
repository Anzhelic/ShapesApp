package an.riabushenko.com;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Colors {
    GREEN("зеленый"),
    BLUE("голубой"),
    INDIGO("синий"),
    VIOLET("фиолетовый"),
    RED("красный"),
    YELLOW("желтый");

    private final String colorName;

    Colors(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return this.colorName;
    }

    private static final List<Colors> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();

    public static Colors randomColor() {
        return VALUES.get(Main.rand.nextInt(SIZE));
    }
}