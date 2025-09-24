// Superclass
class Bank {
    float getROI() {
        return 0;   // default
    }
}

// Subclass SBI
class SBI extends Bank {
    @Override
    float getROI() {
        return 8;
    }
}

// Subclass ICICI
class ICICI extends Bank {
    @Override
    float getROI() {
        return 7;
    }
}

// Subclass AXIS
class AXIS extends Bank {
    @Override
    float getROI() {
        return 9;
    }
}

// Driver class
public class ROI {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate of Interest : " + b.getROI());

        b = new ICICI();
        System.out.println("ICICI Rate of Interest : " + b.getROI());

        b = new AXIS();
        System.out.println("AXIS Rate of Interest : " + b.getROI());
    }
}
