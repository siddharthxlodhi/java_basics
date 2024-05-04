package collection.List.LinkedLIst;

public class NodeDemo {
    NodeDemo(Object data){
        this.data=data;

    }

    private Object data;
    public NodeDemo next;



    public  static NodeDemo createNodes(int n){
      NodeDemo node=new NodeDemo(1);
      NodeDemo head=node;
      for (int i=2;i<=n;i++){
          node.next=new NodeDemo(i);
          node=node.next;
      }
      return head;
    }

    public static void printLinkedlist(NodeDemo node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }

    }

    public static void main(String[] args){
        NodeDemo n1=new NodeDemo(1);
        NodeDemo n2=new NodeDemo(2);
        n1.next=n2;
        NodeDemo n3=new NodeDemo(3);
        n2.next=n3;
        NodeDemo n4=new NodeDemo(4);
        n3.next=n4;
        NodeDemo n5=new NodeDemo(5);
        n4.next=n5;
//        printLinkedlist(n1);
        NodeDemo newOne=createNodes(7);
        printLinkedlist(newOne);


    }

}
