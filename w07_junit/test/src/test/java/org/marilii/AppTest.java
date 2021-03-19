package org.marilii;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static App app;
    @BeforeClass
    public static void init() {
        app = new App();
        // game = new Game();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void checkName() {
        app.name = "Test";
        assertEquals("App name should be Test", "Test", app.getName());
    }

    @Test
    public void checkSum() {
        assertTrue(10 == app.sum(5, 5));
    }

    @Test
    public void doArraysEqual() {
        int[] arr = new int[]{2, 3, 4, 5};

        assertArrayEquals(arr, app.toArray(2, 3, 4, 5));
    }

    @Test
    public void hamcrestTest() {
        assertThat(50, is(not(40)));
        assertThat(60, is(greaterThan(59)));

        assertThat("Hello", startsWith("Hel"));
    }

    @Test
    public void compareObjects() {
        App app1 = new App();
        App app2 = new App();

        assertNotEquals(app1, app2);
    }

    @Test
    public void incorrect() {
        assertFalse("5 != 3", 5 == 3);
    }

    @Test
    public void notEqual() {
        int a = 16;
        assertNotEquals(a, app.getAge());
    }

    @Test
    public void notNull() {
        assertNotNull(app.getAge());
    }

    @Test
    public void notSame() {
        assertNotSame("56", app.sum(50, 6));
    }

    @Test
    public void isNull() {
        assertNull(app.name);
    }

    @Test
    public void isSame() {
        String name = "Game";
        assertSame(name, app.setName("Game"));
    }


    /*@Test
    public void checkIfCoordinatesChange() {
        // game.moveCharacter(3, 4);
        // assertArrayEquals([3, 4], game.getCoordinates());
    }*/
}
