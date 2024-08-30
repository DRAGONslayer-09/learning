package learnCode.practiceOOPS.CustomerOrder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CustomerOrder order = new CustomerOrder("Tan",123546, LocalDate.now());
        CustomerOrder order1 = new CustomerOrder("Kris", 456789, LocalDate.now());
        order1.DisplayOrder();
    }
}
