package t5;

public class Customer {
    // info : name, queue number (qid)
    private String name;
    static int qc = 0;
    private int qID;

    Customer(){
        this.name = "no name input";
        this.qID = qc;
        qc++;
    }
    Customer(String n){
        this.name = n;
        this.qID = qc;
        qc++;
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
        return this.name + "\n  >> Queue number : " + queueNumberToString(this.qID);
    }
}
