package org.kraken.main;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.HashMap;
import java.util.Map;

@Controller("/")
public class TestController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public HttpResponse<?> getResponse() {

        Message msg = new Message();
        msg.setGreeting("Hello");

        Map<String, String> payload = new HashMap<>();
        payload.put("user_name", "jim.kirk");
        payload.put("email", "jim.kirk@cloud.com");
        payload.put("message", msg.getGreeting());

        return HttpResponse.accepted().body(payload);

    }
}
