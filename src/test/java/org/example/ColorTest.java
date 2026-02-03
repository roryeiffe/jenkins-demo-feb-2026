package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColorTest {

    ColorMixer colorMixer;

    @BeforeEach
    public void setup() {
        colorMixer = new ColorMixer();
    }

    @Test
    public void testMix() {
        Assertions.assertEquals(Color.GREEN, colorMixer.mix(Color.BLUE, Color.YELLOW));
        Assertions.assertEquals(Color.PURPLE, colorMixer.mix(Color.BLUE, Color.RED));
        Assertions.assertEquals(Color.BLUE, colorMixer.mix(Color.RED, Color.YELLOW));
    }
}
