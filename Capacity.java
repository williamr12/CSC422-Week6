  import java.lang.reflect.Field;
  import java.util.ArrayList;
  @SuppressWarnings("unchecked")
  public class Capacity{
  //from: https://www.javacodeexamples.com/java-arraylist-capacity/1016
    public static int getArrayListCapacity(ArrayList<?> list){
    Field arrayField = null;
    Object[] internalArray = {0};
    try{
    arrayField = ArrayList.class.getDeclaredField("elementData");arrayField.setAccessible(true);
    }catch (NoSuchFieldException ex){}
    try{
          internalArray = (Object[])arrayField.get(list);
    }catch (IllegalAccessException I){}
        return internalArray.length;
    }
  }
