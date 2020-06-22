import java.util.*;
@SuppressWarnings("unchecked")
public class Stack<E>{
  ArrayList<E> array;
  int n;
  int sizeFlag;
  int limit;
  E first;

  public Stack(){
    limit = 20;
    array = new ArrayList<E>(limit);
  }

  public Stack(int limit){
    this.limit = limit;
    array = new ArrayList<E>(limit);
  }

  public E pop()throws EmptyStackException{
    E first;
    if(array.isEmpty()==true){
      throw new EmptyStackException();
    }else{
      first = array.get(0);
      array.remove(array.get(0));
    }
    System.out.println(first);
    return first;
  }
  public E peek() throws EmptyStackException{
    if(array.isEmpty()==true){
      throw new EmptyStackException();
    }else{
      first = array.get(0);
    }
    System.out.println(first);
    return first;
  }
  public E push(E e)throws FullStackException{
    if(array.size()==limit){
      throw new FullStackException();
    }
    if(array.isEmpty()==true){
      array.add(0,e);
    }else{
    array.set(0,e);
    }
    return e;
  }

  public boolean empty(){
    if(array.isEmpty()==true){
      return true;
    }else{
      return false;
    }
  }

  public int size(){
    System.out.println(array.size());
    return array.size();
  }

  public int capacity(){
    int capacity = Capacity.getArrayListCapacity(array);
    System.out.println(capacity);
    return capacity;
  }


    


}
