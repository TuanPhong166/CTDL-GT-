package vn.giadinh.edu.Menu;

public class DSLK {

    
    Node  head = null; // không bằng null nó cũng tự động rỗng
    Node tail = null ; 

    Node  node = new Node();

    public DSLK(){}

    public void addTail(Book book){
      Node newNode = new Node(book);
        if(head == null ){
            head = newNode ;
            tail = newNode ;
        }else { 
              tail.next = newNode ;
              tail = newNode ;
        }
    }

    public void addHead(Book book) {
     Node newNode = new Node(book);
     if(head == null ){
         head = newNode ;
         tail = newNode ;
     }else {
           newNode.next = head  ;
           head = newNode ;
     }
    }

    public void outPut(Book book){
        Node current = head ;
        
        if(head == null){
            System.out.println("Danh sách rỗng ???");
            return  ;
        }
        System.out.println("Các nút trong danh sách : ");
        while(current != null){
           System.out.println(current.book);
           current = current.next ;
        }
    }

    
    public void deletedTail(){
        Node temp = head ;
        while(temp != null){
            if(temp.next ==tail){
                temp.next=null ;
                tail = temp ;
                break ;
            }
            temp = temp.next ;
        }
    }





    
}
