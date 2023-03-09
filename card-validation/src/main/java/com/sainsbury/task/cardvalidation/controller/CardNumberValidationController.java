package com.sainsbury.task.cardvalidation.controller;

import com.sainsbury.task.cardvalidation.service.CardNumberValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardNumberValidationController {

    @Autowired
    CardNumberValidationService cardNumberValidationService;

    @GetMapping("/card/number/{number}")
    public boolean isValidCard(@PathVariable String number) {
        return cardNumberValidationService.isValid(number);
    }
}
