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
    if(size == 0){
      start = n;
      end = n;
      n.setPrev(null);
      n.setNext(null);
    }
    else if(index == 0){
      n.setNext(start);
      n.setPrev(null);
      start.setPrev(n);
      start = n;
    }
    else if(index == size){
      n.setPrev(end);
      n.setNext(null);
      end.setNext(n);
      end = n;
    }
    else{
      Node current = start;
      for(int i = 0; i < index; i++){
        current = current.getNext();
      }
      n.setPrev(current.getPrev());
      n.setNext(current);
      current.getPrev().setNext(n);
    }
    size ++;
  }

  public String get(int index){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    Node current = start;
    for(int i = 0; i < index; i++){
      current = current.getNext();
    }
    return current.getData();
  }

  public String set(int index, String value){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    Node n = new Node(value);
    Node current = start;
    for(int i = 0; i < index; i++){
      current = current.getNext();
    }
    n.setPrev(current.getPrev());
    n.setNext(current.getNext());
    current.getPrev().setNext(n);
    current.getNext().setPrev(n);
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

  public String remove(int index){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    String removed = start.getData();
    if(index == 0){
      start.getNext().setPrev(null);
      start = start.getNext();
    }
    else if(index == size - 1){
      end.getPrev().setNext(null);
      end = end.getPrev();
    }
    else if(size == 1){
      start = null;
      end = null;
    }
    else{
      Node current = start;
      for(int i = 0; i < index; i++){
        current = current.getNext();
      }
      current.getPrev().setNext(current.getNext());
      current.getNext().setPrev(current.getPrev());
    }
    size--;
    return removed;
  }

}
