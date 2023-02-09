package t5;

public class Customer {
    // info : name, queue number (qid)
    static String name;
    static int qID = 0;

    Customer(){
        name = "no name input";
        int qID = Customer.qID;
        Customer.qID++;
        System.out.println("Customer.qid"+Customer.qID);
        System.out.println("qid"+qID);
    }
    public String queueNumberToString(int n){
        if(n > 99){
            return Integer.toString(n);
        }else if(n > 9){
            return "0"+Integer.toString(n);
        }else{
            return "00"+Integer.toString(n);
        }
    }
    public String toString(){
        return "Name : " + name + "\n Queue number :" + queueNumberToString(qID);
    }
}
