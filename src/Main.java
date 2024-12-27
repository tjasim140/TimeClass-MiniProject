//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(8, 9, 58);
        System.out.println("time1: "+time1);

        //Tests changing seconds to minutes
        time1.tick();
        time1.tick();
        System.out.println("\nExpected: 08:10:00");
        System.out.println("Actual: "+time1);

        //Tests adding seconds
        time1.tick();
        System.out.println("\nExpected: 08:10:01");
        System.out.println("Actual: "+time1);

        time1.tick();
        System.out.println("\nExpected: 08:10:02");
        System.out.println("Actual: "+time1);

        time1.tick();
        System.out.println("\nExpected: 08:10:03");
        System.out.println("Actual: "+time1);

        Time time2 = new Time(8,59,58);
        System.out.println("\ntime2: "+time2);

        //Tests minutes to hours
        time2.tick();
        time2.tick();
        System.out.println("\nExpected: 09:00:00");
        System.out.println("Actual: "+time2);

        Time time3 = new Time (23,59,59);
        System.out.println("\ntime3: "+time3);

        //Tests resetting clock to exact midnight
        time3.tick();
        System.out.println("\nExpected: 00:00:00");
        System.out.println("Actual: "+time3);

        //Tests that clock starts back at seconds once reset after tick method is called
        time3.tick();
        System.out.println("\nExpected: 00:00:01");
        System.out.println("Actual: "+time3);

        Time time4 = new Time(10, 14, 43);
        System.out.println("\ntime4: "+time4);

        Time time5 = new Time(8, 30, 29);
        System.out.println("time5: "+time5);

        //Tests add method
        time4.add(time5);
        System.out.println("\nExpected: 18:45:12");
        System.out.println("Actual: "+time4);
        System.out.println("\nExpected: 08:30:29");
        System.out.println("Actual:"+time5);

        Time time6 = new Time(7, 20, 0);
        System.out.println("\ntime6: "+time6);

        //Tests adding time up to a time past exact midnight
        time4.add(time6);
        System.out.println("\nExpected: 02:05:12");
        System.out.println("Actual: "+time4);



    }
}