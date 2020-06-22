import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
  public static void run() {
    Result result = JUnitCore.runClasses(TestStack.class);
    
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
    
    System.out.println(result.wasSuccessful());
  }
}
