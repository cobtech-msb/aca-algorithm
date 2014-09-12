package week02.p2;

class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree bt;
        BinaryTree lt;
        BinaryTree rt;
        BinaryTree leftT;
        BinaryTree rightT;
        
        // 왼쪽 트리에 "D"를 넣는다.
        lt = new BinaryTree(new BinaryTree(), "D", new BinaryTree());
        // 오른쪽 트리에 "E"를 넣는다.
        rt = new BinaryTree(new BinaryTree(), "E", new BinaryTree());
        // 최상위 트리에 "B"를 넣고 왼쪽 트리와 오른쪽 트리를 연결한다.
        bt = new BinaryTree(lt, "B", rt);
        
        // 최상위 트리의 주소를 왼쪽 트리에 넣는다.
        //  B
        // D E
        lt = bt;
        
        // 오른쪽 트리에 "C"를 넣는다.
        rt = new BinaryTree(new BinaryTree(), "C", new BinaryTree());
        // 최상위 트리에 "A"를 넣고, 왼쪽 트리와 오른쪽 트리를 연결한다.
        //     A
        //   B   C
        //  D E    
        bt = new BinaryTree(lt, "A", rt);
        
        System.out.println("최상위 노드의 데이터값");
        System.out.println(bt.rootData());
        
        System.out.println("좌측서브트리의 루트 노드 데이터값");
        leftT = bt.leftTree();
        System.out.println(leftT.rootData());
        
        System.out.println("우측서브트리의 루트 노드 데이터값");
        rightT = bt.rightTree();
        System.out.println(rightT.rootData());
    }
}