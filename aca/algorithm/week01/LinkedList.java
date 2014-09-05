public class LinkedList {
    private ListNode head;
    
    public void addLastNode(String data)
    {
        ListNode newNode = new ListNode();
        newNode.data = data;
        newNode.link = null;
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        ListNode p = head;
        
        while (p.link != null) {
            p = p.link;
        }
        
        p.link = newNode;
    }
    
    public void deleteLastNode() {
        ListNode pNode, cNode;
        
        if (head == null) {
            return;
        }
        else if (head.link == null) {
            head = null;
            return;
        }
        else {
            pNode = head;
            cNode = head.link;
            
            while (cNode.link != null) {
                pNode = cNode;
                cNode = cNode.link;
            }
            
            pNode.link = null;
        }
    }
    
    public void printList() {
        ListNode p;
        p = head;
        
        while (p != null) {
            System.out.print(p.data);
            p = p.link;
            
            if (p != null) {
                System.out.print(" - ");
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        
        L.addLastNode("KIM");
        L.addLastNode("LEE");
        L.addLastNode("LIM");
        L.addLastNode("PARK");
        
        System.out.print("Current nodes: ");
        L.printList();
        System.out.println();
        
        L.deleteLastNode();
        System.out.println("Last node was deleted.");
        System.out.print("Current nodes: ");
        L.printList();
        System.out.println();
    }
}