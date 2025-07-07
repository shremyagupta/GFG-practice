import java.util.LinkedList;
import java.util.Queue;
public class queue {
    static Queue<Integer> q = new LinkedList<>();

    static boolean isEmpty(){
        return q.isEmpty();
    }

    static void enqueue(int data){
        q.add(data);
    }

    static void dequeue(){
        if(isEmpty()){
            return;
        }
        q.remove();

    }

    static int getFront(){
        if(isEmpty()) return -1;
        return q.peek();
    }
    static int getRear(){
        if(isEmpty()) return  -1;
        return ((LinkedList<Integer>) q).getLast();
    }
    public static void main(String[] args) {
        enqueue(1);
         enqueue(2);
          enqueue(4);
           enqueue(6);
            enqueue(8);

            if(!isEmpty()){
                System.out.println("Queeue after enqueue");
                for(int num :q){
                    System.out.println(num +" ");
                }
                System.out.println();
            }
            System.out.println("Front"+ getFront());
            System.out.println("Front"+ getRear());
            System.out.println("size"+ q.size());
            dequeue();
            System.out.println("is queue empty? " + (isEmpty()? "Yes" : "No"));

    }
    
}
