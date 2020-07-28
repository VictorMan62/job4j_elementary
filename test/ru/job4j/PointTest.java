package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

    public class PointTest {

        @Test
        public void result1() {
            int x1 = 2;
            int y1 = 2;
            int x2 = 4;
            int y2 = 4;
            double expected = 2.8284271247461903;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void result2() {
            int x1 = 3;
            int y1 = 3;
            int x2 = 6;
            int y2 = 6;
            double expected = 2.8284271247461903;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }
}