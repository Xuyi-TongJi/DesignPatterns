package edu.seu.chainOfResponsibility.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PurchaseRequest {

    private final float price;
    private final int id;
}