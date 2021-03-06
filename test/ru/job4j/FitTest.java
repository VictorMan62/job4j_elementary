package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

    public class FitTest {

        @Test
        public void manWeight() {
            double in = 187;
            double expected = 100.55;
            double out = Fit.manWeight(in);
            Assert.assertEquals(expected, out, 0.01);

        }

        @Test
        public void womanWeight() {
            double in = 187;
            double expected = 88.55;
            double out = Fit.womanWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }
}