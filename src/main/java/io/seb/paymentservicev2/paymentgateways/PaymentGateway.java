package io.seb.paymentservicev2.paymentgateways;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import org.springframework.boot.configurationprocessor.json.JSONException;

public interface PaymentGateway {

    String generatePaymentLink(String email, String phone, Long amount) throws StripeException, RazorpayException, JSONException;

}
