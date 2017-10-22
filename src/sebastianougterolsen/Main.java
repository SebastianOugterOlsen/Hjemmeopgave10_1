package sebastianougterolsen;

public class Main {

    public static void main(String[] args) {
        Time time1 = new Time(10, 40, 30);
        System.out.println("Current time: " + time1.getCTime());
        System.out.println("Specific elapsed time: " + time1.getSETime(10, 10, 10));
        System.out.println("Specific time: " + time1.getSTime(15, 20, 30));
        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());
        System.out.println(time1.settingTime(15,30, 5));

    }
}
