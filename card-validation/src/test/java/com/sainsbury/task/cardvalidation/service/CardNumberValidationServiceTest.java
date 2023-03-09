package com.sainsbury.task.cardvalidation.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardNumberValidationServiceTest {

    private static final String VALID_CARD_NUMBER = "4242424242426742";
    private static final String INVALID_CARD_NUMBER = "111111111111111";

    private CardNumberValidationService cardNumberValidationServiceUnderTest;

    @Before
    public void setUp() {
        cardNumberValidationServiceUnderTest = new CardNumberValidationService();
    }

    @Test
    public void testIsValid() {
        assertTrue(cardNumberValidationServiceUnderTest.isValid(VALID_CARD_NUMBER));
    }

    @Test
    public void testIsNotValid() {
        assertFalse(cardNumberValidationServiceUnderTest.isValid(INVALID_CARD_NUMBER));
    }
}
