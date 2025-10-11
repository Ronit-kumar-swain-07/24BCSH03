interface Servicing {
    void getServiceTime();
}

class Car implements Servicing {
    public void getServiceTime() {
        System.out.println("The Service Time of the Car is : 5 hours");
    }
}

class Bike implements Servicing {
    public void getServiceTime() {
        System.out.println("The service time of the Bike is : 2 hours");
    }
}

public class ServTime {
    public static void main(String[] args) {
        
        Servicing car = new Car();
        Servicing bike = new Bike();
        car.getServiceTime();
        bike.getServiceTime();
    }
}
