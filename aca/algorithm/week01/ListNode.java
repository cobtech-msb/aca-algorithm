public class ListNode {
    String data;
    ListNode link;
    
    public ListNode() {
        data = null;
        link = null;
    }
    
    public ListNode(String data) {
        this.data = data;
        this.link = null;
    }
    
    public ListNode(String data, ListNode p)
    {
        this.data = data;
        this.link = p;
    }
}