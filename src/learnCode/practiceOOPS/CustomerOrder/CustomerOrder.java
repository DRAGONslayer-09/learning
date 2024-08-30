package learnCode.practiceOOPS.CustomerOrder;

import java.time.LocalDate;

public class CustomerOrder {
    private String customer;
    private int orderID;
    private LocalDate orderDate;

    public String getCustomer() {
        return customer;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public CustomerOrder(String customer, int orderID, LocalDate orderDate){
        this.customer = customer;
        this.orderID = orderID;
        this.orderDate = orderDate;
    }
    public void DisplayOrder(){
        System.out.println("Order ID: "+ orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Customer Name: " + customer);
    }
}
