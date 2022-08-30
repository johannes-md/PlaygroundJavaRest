package digital.metro;

import java.sql.Timestamp;
import java.time.Instant;

public class Order {
    private final String orderId;
    private final Timestamp orderSubmission;

    public Order( String orderId ) {
        this.orderId = orderId;
        this.orderSubmission = Timestamp.from( Instant.now() );
    }

    public String getOrderId() {
        return orderId;
    }

    public Timestamp getOrderSubmission() {
        return orderSubmission;
    }
}
