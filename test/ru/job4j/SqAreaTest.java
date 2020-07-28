package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

    public class SqAreaTest {

            @Test
            public void result1() {
                double p = 4;
                double k = 1;
                double expected = 2;
                double out = SqArea.square(p, k);
                Assert.assertEquals(expected, out, 0.01);
            }

            @Test
            public void result2() {
                double p = 6;
                double k = 2;
                double expected = 2;
                double out = SqArea.square(p, k);
                Assert.assertEquals(expected, out, 0.01);
            }
}