package com.Launchable.example;

import com.Launchable.examples.MagicBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMAgicBuilder {
    @Test
    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }
}
