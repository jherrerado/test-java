package com.jherrera.JavaTest.payments;

public class PaymentResponse {
    enum paymentStatus {
        OK, ERROR
    }
    private paymentStatus status;

    public PaymentResponse(paymentStatus status) {
        this.status = status;
    }

    public paymentStatus getStatus() {
        return status;
    }

    public void setStatus(paymentStatus status) {
        this.status = status;
    }
}
