package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void  findMaxAtFirstPosition(){
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {12,5,8,4,5,3,8,6,11,11,12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void  findMaxNotAtFirstPosition() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {10,15,9,2,7,8,7,16};
        long expected = 16;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}