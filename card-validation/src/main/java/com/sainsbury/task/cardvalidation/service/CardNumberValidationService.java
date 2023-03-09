package com.sainsbury.task.cardvalidation.service;

import org.springframework.stereotype.Service;

@Service
public class CardNumberValidationService {
    public boolean isValid(String cardNumber) {
        int nDigits = cardNumber.length();
        int nSum = 0;
        boolean isSecond = false;
        for (int i = nDigits - 1; i >= 0; i--) {
            int d = cardNumber.charAt(i) - '0';
            if (isSecond == true)  // Check if its an even location digit then double it
                d = d * 2;
            nSum += d / 10;
            nSum += d % 10;

            isSecond = !isSecond;
        }
        return (nSum % 10 == 0);
    }

}
