public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node n = new Node(value);
    if(size == 0){
      start = n;
      end = n;
      n.setPrev(null);
      n.setNext(null);
    }
    else{
      Node temp = end;
      end.setNext(n);
      end = n;
      end.setNext(null);
      n.setNext(temp);
    }
    size++;
    return true;
  }

  public void add(int index, String value){
  }
  public String get(int index){
    return "";
  }
  public String set(int index, String value){
    return "";
  }
  public String toString(){
    return "";
  }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
