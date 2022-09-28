package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void convert4ToString() {
        // given
        int number = 4;

        // when
        String actual = Main.fizzbuzz(number);

        // then
        String expected = "4";
        assertEquals(expected, actual);
    }

    @Test
    public void convert1ToString() {
        // given
        int number = 1;

        // when
        String actual = Main.fizzbuzz(number);

        // then
        String expected = "1";
        assertEquals(expected, actual);
    }

}