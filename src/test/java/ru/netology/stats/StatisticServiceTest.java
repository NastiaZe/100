package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {10,15,9,2,7,8,7,16};
        long expected = 16;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}