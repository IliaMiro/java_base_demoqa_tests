package tests.examples;

import org.junit.jupiter.api.*;

public class JUnitExamplesTests {

    @BeforeAll
    static void Startup () {
        System.out.println ("tests startup");
    }

    @AfterAll
    static void teardown () {
        System.out.println ("tests ended");
    }

    @BeforeEach
    void StartBrowser () {
        System.out.println ("- Browser has started");
    }

    @AfterEach
    void StopBrawser () {
        System.out.println ("- Browser has stopped");
    }

    @Test
    void firstTest () {
        System.out.println ("- - firstTest");
    }

    @Test
    void secondTest () {
        System.out.println ("- - secondTest");
    }
}
