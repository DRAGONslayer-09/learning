package learnCode.practiceOOPS.CustomerOrder;

import java.time.LocalDate;

public class OnlineOrder extends CustomerOrder{
    private String Address;
    private String TrackingID;
    private Object LocalDate;

    public OnlineOrder(String customer, int orderID, LocalDate orderDate) {
        super(customer, orderID, orderDate);
        this.Address = getAddress();
        this.TrackingID = getTrackingID();
    }
    public String getAddress() {
        return Address;
    }

    public String getTrackingID() {
        return TrackingID;
    }
    private LocalDate LocalDate() {
        return LocalDate();
    }
    public int DeliveryTime(){
        return LocalDate().getDayOfMonth();
    }

}
