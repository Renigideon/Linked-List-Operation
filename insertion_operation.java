package singly_linked_list_operation;

public class insertion_operation {
    private class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    private Node head=null;
    private Node tail=null;
    public void insert_elements(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
    }
    public void insert_last(int val){
        if(tail==null){
            insert_elements(val);
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
    }
    public void insert_mid(int val,int index){
        if(tail==null){
            insert_elements(val);
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public int del_first(){
        int val=head.data;
        head=head.next;
        if(tail==null){
            tail=head;
        }
        return val;
    }
    public void del_last(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void delete_mid(int k){
        Node temp=head,prev=null;
        int c=0;
        while (temp!=null){
            c++;
            if(c==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
    }

}
