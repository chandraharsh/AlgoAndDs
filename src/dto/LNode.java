package dto;

public class LNode {

    Integer data;
    LNode next;

    public LNode(Integer data) {
        this.data = data;
        this.next = null;
    }
    LNode head;

    public void enqueue(Integer data) {
        LNode n = new LNode(data);
        if(head == null) {
            head = n;
            return;
        }
        else {
            LNode q = head;
            while (q.next!=null)
                q=q.next;
            q.next = n;
            return;
        }
    }

    public Integer dequeue () {
        LNode n = head;
        if(head == null) {
            System.out.println("Underflow");
            return null;
        }
            head = head.next;
            n.next = null;
            return n.data;

    }

    public void display(){
        LNode l = head;
        while(l!=null){
            System.out.println(" " + l.data);
            l = l.next;
        }
    }

    public static void main (String[] args) {
        LNode llist = new LNode(null);
        llist.enqueue(1);
        llist.enqueue(2);
        llist.dequeue();
        llist.dequeue();
        llist.dequeue();
        llist.display();

    }


}
