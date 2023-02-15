package com.jherrera.JavaTest.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);

}
