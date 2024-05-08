package io.seb.paymentservicev2.services;

import com.stripe.exception.StripeException;
import io.seb.paymentservicev2.paymentgateways.stripe.StripePayementGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private StripePayementGateway stripePayementGateway;

    public PaymentService(StripePayementGateway stripePayementGateway) {
        this.stripePayementGateway = stripePayementGateway;
    }

    public String createPaymentLink(Long orderId) throws StripeException {

        // Payemnt gateway atleast expect email, phone, and amount from the order service


        /*
        * OrderService orderService = restClient.get("localhost:8000/orders/{orderId}");
        * Long userId = orderService.getUserId();
        * UserService userService = restClient.get("localhost:8000/users/{userId}");
        * String emailOfCustomer = userService.getEmail();
        * String phoneOfCustomer = userService.getPhone();
        * Long amount = userService.getAmount();
        * */

        return stripePayementGateway.generatePaymentLink("sebastian.anandas@gmail.com", "9930498990", 10000L);
    }


}
