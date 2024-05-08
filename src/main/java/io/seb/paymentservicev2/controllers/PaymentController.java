package io.seb.paymentservicev2.controllers;

import com.stripe.exception.StripeException;
import io.seb.paymentservicev2.dtos.CreatePaymentLinkRequestDto;
import io.seb.paymentservicev2.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService thePaymentService) {
        this.paymentService = thePaymentService;
    }

    @PostMapping("/")
    public String createPaymentLink(@RequestBody CreatePaymentLinkRequestDto request) throws StripeException {
        return paymentService.createPaymentLink(request.getOrderId());
    }

}
