import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Testcase4 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your Birth date(yyyy-mm-dd):");
        String in1 = input1.next();
        //System.out.println(in1);
        int s1 = Integer.parseInt(in1.substring(0, 4));
        //System.out.println("chk "+s1);
        int s2 = Integer.parseInt(in1.substring(5, 7));
        //System.out.println("chk "+s1+" "+s2);
        int s3 = Integer.parseInt(in1.substring(8, 10));
        //System.out.println("chk "+s1+" "+s2+" "+s3);
        LocalDate givenDate = LocalDate.of(s1, s2, s3);
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate);
        System.out.println(givenDate);
        Period period = Period.between(givenDate, curDate);
        
        System.out.println("Test case.  "+period.getYears()+" years, "+period.getMonths()
                    	+" months, and "+period.getDays() + " days.");
        
    }
}