package bai1;

import bai1.NextDayCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    void getNextDayTest1() {
        //Input
        int day = 28;
        int month = 2;
        int year = 2022;
        //Ket qua mong muon
        String excpected = "1 / 3 / 2022";
        //Ket qua thuc te
        String resutl = NextDayCalculator.checkDayMonthYear(day, month, year);
        //So sanh
        assertEquals(excpected, resutl);


    }

}