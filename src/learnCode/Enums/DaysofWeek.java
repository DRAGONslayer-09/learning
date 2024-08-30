package learnCode.Enums;

public class DaysofWeek {
    public enum week{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday;

        public static void main(String[] args) {
            week day1 = Sunday;
            week day2 = Monday;
            week day3 = Tuesday;
            week day4 = Wednesday;
            week day5 = Thursday;
            week day6 = Friday;
            week day7 = Saturday;
            System.out.println("Today is " + day6);
        }

    }
}
