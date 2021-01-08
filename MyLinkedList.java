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
      end = n;
      end.setNext(null);
      n = temp;
      n.setNext(end);
    }
    size++;
    return true;
  }

  public void add(int index, String value){
    Node n = new Node(value);
    Node current = start;
    for(int i = 0; i < index; i++){
      current = current.getNext();
    }
    Node temp = current;
    n.setPrev(current.getPrev());
    n.setNext(temp);
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
