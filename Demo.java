class Bank_customer{
    String cust_name;
    String cust_id;
    String cust_address;

    Bank_customer(String cust_name,String cust_id,String cust_address){
        this.cust_name=cust_name;
        this.cust_id=cust_id;
        this.cust_address=cust_address;
    }
    public void display(){
        System.out.println("Customer Name:"+cust_name);
        System.out.println("Customer ID:"+cust_id);
        System.out.println("Customer Address:"+cust_address);
    }
}
class Bank_Transactions{
    String Acc_name="SBI";
    String Acc_Holder_Name="Zaynab";
    String Account_type="Saving";
    String Account_Number="123AB45678";
    double balance=10000.00;

public void show(){
    System.out.println("Account Name:"+Acc_name);
    System.out.println("Account Holder Name:"+Acc_Holder_Name);
    System.out.println("Account Type:"+Account_type);
    System.out.println("Account Number:"+Account_Number);
    System.out.println("Balanace:"+balance);
    }
}
public class Demo{
    public static void main(String[] args) {
        Bank_customer b = new Bank_customer("Prerna", "B001", "Hubli");
        b.display();

        Bank_Transactions b1 = new Bank_Transactions();
        b1.show();
    }
    
}