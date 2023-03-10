package t5;

public class Queue {
    public static int frontPointer = 0;
    public static int backPointer = 0;
    Customer[] qlist = new Customer[999];
    Queue(){
    
    }
    public boolean isEmpty(){
        if(backPointer == frontPointer){
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(Customer c){    
        qlist[backPointer] = c;
        if(backPointer++ > 999){
            backPointer = 0;
        }
    }
    public void dequeue(){
        if(isEmpty == false){
            qlist[frontPointer] = null;
            if(frontPointer++ > 999){
                frontPointer = 0;
            }
        }else{
            System.out.println("Attempted to dequeued an empty queue, nothing happened");
        }
    }
    public String front(){
        if(isEmpty() == false)
            return "next person in queue is " + qlist[frontPointer].toString();
        // empty
        return "the list is empty";
    }
}