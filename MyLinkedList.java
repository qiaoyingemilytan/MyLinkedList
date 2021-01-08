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
      n.setPrev(end);
      end.setNext(n);
      end = n;
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
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    Node n = new Node(value);
    Node current = start;
    for(int i = 0; i < index; i++){
      current = current.getNext();
    }
    Node temp = current;
    n.setPrev(current.getPrev());
    n.setNext(temp);
    size ++;
  }
  public String get(int index){
    Node current = start;
    for(int i = 0; i < index; i++){
      current = current.getNext();
    }
    return current.getData();
  }
  public String set(int index, String value){
    Node n = new Node(value);
    Node current = start;
    for(int i = 0; i < index; i++){
      current = current.getNext();
    }
    n = current;
    return current.getData();
  }
  public String toString(){
    String list = "[";
    Node current = start;
    for(int i = 0; i < size; i++){
      list = list + current.getData();
      if(i != size - 1){
        list += ", ";
      }
      current = current.getNext();
    }
    return list + "]";
  }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
