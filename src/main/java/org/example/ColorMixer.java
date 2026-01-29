package org.example;

public class ColorMixer {
    public Color mix(Color color1, Color color2) {
        if (containsColor(color1, color2, Color.YELLOW) && containsColor(color1, color2, Color.BLUE)) return Color.GREEN;
        if (containsColor(color1, color2, Color.YELLOW) && containsColor(color1, color2, Color.RED)) return Color.ORANGE;
        if (containsColor(color1, color2, Color.RED) && containsColor(color1, color2, Color.BLUE)) return Color.PURPLE;
        else return Color.UNKNOWN;

    }

    private boolean containsColor(Color color1, Color color2, Color test) {
        return test.equals(color1) || test.equals(color2);
    }
}
