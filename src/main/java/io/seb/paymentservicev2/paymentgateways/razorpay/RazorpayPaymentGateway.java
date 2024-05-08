package io.seb.paymentservicev2.paymentgateways.razorpay;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import io.seb.paymentservicev2.paymentgateways.PaymentGateway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class RazorpayPaymentGateway implements PaymentGateway {

    @Value("${razorpay.secret_key}")
    private String razorpaySecretKey;

    @Value("${razorpay.keyId}")
    private String razorpaykeyId;

    @Override
    public String generatePaymentLink(String email, String phone, Long amount) throws StripeException, RazorpayException, JSONException {

//        RazorpayClient razorpay = new RazorpayClient(razorpaykeyId, razorpaySecretKey);
//
//        JSONObject orderRequest = new JSONObject();
//        orderRequest.put("amount",amount);
//        orderRequest.put("currency","INR");
//        orderRequest.put("receipt", "receipt#1");
//        JSONObject notes = new JSONObject();
//        notes.put("notes_key_1","Tea, Earl Grey, Hot");
//        orderRequest.put("notes",notes);
//
//        Order order = instance.orders.create(orderRequest);

        return null;
    }
}
