public class Student {
    public static void main(String[] args) 
   {
        String sic = args[0];
        String name = args[1];
        String branch = args[2];
        int total = 0;
        for (int i = 3; i < 9; i++) 
	{
            total += Integer.parseInt(args[i]);
        }
        double average = total / 6.0;
        System.out.println("Student Details:");
        System.out.println("SIC    : " + sic);
        System.out.println("Name   : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("Average Marks = " + average);
    }
}
