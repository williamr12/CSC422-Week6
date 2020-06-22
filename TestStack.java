import org.junit.Test;
import static org.junit.Assert.*;

public class TestStack {
    static Stack stack = new Stack(5);
    static Stack testStack;
    @Test
    public void testStackCapacity(){
       testStack = new Stack(5);
      assertEquals(5, testStack.capacity());
    }
   @Test
   public void testPush() {
     stack.push("push");
     assertEquals("push", stack.peek());
   }

   @Test
   public void testSize(){
     assertEquals(1, stack.size());
   }
  @Test
   public void testPeek(){
      stack.push("peek");
      assertEquals("peek", stack.peek());
   }
  @Test
   public void testPop(){
     assertEquals("peek", stack.pop());
   }
   @Test
   public void testEmptyFalse(){
     assertFalse(stack.empty()==true);
   }
   @Test
   public void testEmptyTrue(){
     assertTrue(stack.empty()==false);
   }
}
