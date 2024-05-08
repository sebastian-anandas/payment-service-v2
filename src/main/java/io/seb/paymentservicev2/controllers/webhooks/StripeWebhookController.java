package io.seb.paymentservicev2.controllers.webhooks;

import com.stripe.model.Event;
import com.stripe.net.Webhook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook/stripe")
public class StripeWebhookController {

    @GetMapping("/")
    public void handleWebhookRequest(@RequestBody Event webhookEvent) {
        return;
    }

}
