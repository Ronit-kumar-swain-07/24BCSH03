
abstract class Bank{
    abstract double getROI();
}

class SBI extends Bank{
    double getROI(){
            return 10;
    }
}

class PNB extends Bank{
    double getROI(){
            return 6;
    }
}

class BOI extends Bank{
    double getROI(){
            return 7;
    }
}



public class BankROI {

    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("The Rate of Interest of SBI: " + b.getROI() + "%");

        b = new PNB();
        System.out.println("The Rate of Interest of SBI: " + b.getROI() + "%");

        b = new BOI();
        System.out.println("The Rate of Interest of SBI: " + b.getROI() + "%");

    }
}
