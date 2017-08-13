package cn.seankxh.tutorial;

import org.junit.*;

public class HelloWordTest {
    @BeforeClass
    public static void calledBeforeAllCases() {

    }

    @AfterClass
    public static void calledAfterAllCases() {

    }

    @Before
    public void calledBeforeEachCase() {

    }

    @After
    public void calledAfterEachCase() {

    }

    @Test
    public void test() throws Exception {
        HelloWord.run();
    }
}
