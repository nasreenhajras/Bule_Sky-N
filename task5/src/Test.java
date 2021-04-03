/**
 * Created by user on 03/03/21.
 */
public class Test {
    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        SinglyLinkedList list1 = new SinglyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        list1.addLast(70);
        list1.addLast(80);

        System.out.println(list.findSecondLastNode(list.head));
        System.out.println("----------------");

        list.rotate(4);
        System.out.println(list.print());
        System.out.println("----------------");

        System.out.println(list.newSize());
        System.out.println("----------------");

        list.concatTwoLists(list,list1);
        System.out.println(list.print());
        System.out.println("----------------");

     list.head = list.reverse(list.head);
        System.out.println(list.print());

    }
}
