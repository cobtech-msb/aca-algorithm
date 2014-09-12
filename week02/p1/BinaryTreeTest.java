package week02.p1;

class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree bt;
        BinaryTree lt;
        BinaryTree rt;
        
        lt = new BinaryTree(new BinaryTree(), "D", new BinaryTree());
        rt = new BinaryTree(new BinaryTree(), "E", new BinaryTree());
        bt = new BinaryTree(lt, "B", rt);
        
        lt = bt;
        
        rt = new BinaryTree(new BinaryTree(), "C", new BinaryTree());
        bt = new BinaryTree(lt, "A", rt);
        
        System.out.println("최상위 노드의 데이터값");
        System.out.println(bt.root.data);
    }
}