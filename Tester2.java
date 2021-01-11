public class Tester2{
  public static void main(String[] args){
    Node a = new Node("a");
    MyLinkedList list = new MyLinkedList();
    MyLinkedList list2 = new MyLinkedList();
    list.add("a");
    list.add("b");
    list.add("c");
    list.extend(list2);
    System.out.println(list.toString());
    System.out.println(list.toStringReversed());
    System.out.println(list.size());
    System.out.println(list2.size());
  }
}
