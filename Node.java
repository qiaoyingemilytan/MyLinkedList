public class Node{
  public Node(String value){
    data = value;
  }
  private String data;
  private Node next,prev;

  public String getData(){
    return data;
  }

  public Node getNext(){
    return next;
  }

  public Node getPrev(){
    return prev;
  }
}
