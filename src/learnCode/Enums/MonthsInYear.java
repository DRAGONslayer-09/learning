package learnCode.Enums;

public class MonthsInYear {
    public enum year{
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }

    public static void main(String[] args) {
        year month1 = year.January;
        year month2 = year.February;
        year month3 = year.March;
        year month4 =year.April;
        year month5 = year.May;
        year month6 =year.June;
        year month7 = year.July;
        year month8 = year.August;
        year month9 =year.September;
        year month10 =year.October;
        year month11 =year.November;
        year month12 =year.December;

        System.out.println("Current month is " + month6);
    }
}
