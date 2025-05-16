abstract class server{
    abstract public void withdraw();
    abstract public void deposit();
    abstract public void balance();
}
class sbiatm extends server{
    public void withdraw(){
        System.out.println("Money is withdrawn from SBI.....");
    }
    public void deposit(){
        System.out.println("Money is successfully deposited in SBI .....");
    }
    public void balance(){
        System.out.println("SBI account balance fetched successfully....");
    }
}
class hdfc extends server{
    public void withdraw(){
        System.out.println("Money is withdrawn from HDFC atm....");
    }
    public void deposit(){
        System.out.println("Money is deposited in HDFC bank....");
    }
    public void balance(){
        System.out.println("HDFC account balance is fetched successfully....");
    }
}
public class atm {
    public static void main(String[] args) {
        sbiatm m=new sbiatm();
        System.out.println("********* The following is for SBI Bank *********");

        m.deposit();
        m.withdraw();
        m.balance();
        hdfc h=new hdfc();
        System.out.println("********* The following is for HDFC Bank *********");
        h.deposit();
        h.withdraw();
        h.balance();
    }
}
