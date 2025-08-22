package singly_linked_list_operation;

public class Main {
    public static void main(String[] args) {
        insertion_operation node=new insertion_operation();
        node.insert_elements(1);
        node.insert_elements(2);
        node.insert_elements(3);
        node.insert_elements(4);
        node.insert_elements(5);
        node.insert_elements(6);
        node.display();
        node.insert_last(10);
        node.insert_mid(85,2);
        node.display();
        node.del_first();
        node.display();
        node.del_last();
        node.display();
        node.delete_mid(3);
        node.display();




    }
}
