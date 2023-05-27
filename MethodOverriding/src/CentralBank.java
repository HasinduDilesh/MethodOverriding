public class CentralBank {
    int getInterestRate(){
        return 0;
    }
}
class BOC extends CentralBank{
    int getInterestRate(){
        return 8;
    }
}
class PeoplesBank extends CentralBank{
    int getInterestRate(){
        return 10;
    }
}
class CommercialBank extends CentralBank{
    int getInterestRate(){
        return 12;
    }
}
class TestOverriding {
    public static void main(String[] args) {
        BOC b = new BOC();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();

        System.out.println("BOC Bank Interest Rate : " + b.getInterestRate() + "%");
        System.out.println("People's Bank Interest Rate : " + p.getInterestRate() + "%");
        System.out.println("Commercial Bank Interest Rate : " + c.getInterestRate() + "%");
    }
    }