package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {

    @Test
    void should_check_driver_be_of_age() {

        assertTrue(new Police().checkDriverBeOfAge(new Driver(18)));
        assertFalse(new Police().checkDriverBeOfAge(new Driver(17)));
    }


}
