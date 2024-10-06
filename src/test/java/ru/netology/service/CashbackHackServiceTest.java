package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assume;

public class CashbackHackServiceTest {

    @Test
    void shouldCalculateMissingQty() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemainForExactThousand() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertEquals(0, service.remain(1000));
    }

    @Test
    void amountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }
}
