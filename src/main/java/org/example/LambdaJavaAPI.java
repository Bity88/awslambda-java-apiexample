package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Collections;

public class LambdaJavaAPI implements RequestHandler<Object, GateWayResponse> {


    @Override
    public GateWayResponse handleRequest(Object o, Context context) {
        String message = "Hello, Bro how are you?";
        System.out.println(message);

        GateWayResponse response = new GateWayResponse(message,
                200,
                Collections.singletonMap("X-Powered-By", "TechPrimers"),
                false
        );


        return response;
    }
}
