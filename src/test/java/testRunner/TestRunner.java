package testRunner;

import org.testng.TestNG;
import testSuite.TestInteractWithInputAndButtonFieldsSuite;

public class TestRunner {

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { TestInteractWithInputAndButtonFieldsSuite.class });
        testng.run();
    }

}
