package com.oblig2;

import org.junit.jupiter.api.Test;

import static com.oblig2.LeapYearTest.LeapYear.isLeapYear;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    // Here I test to see if the leap year is dividable by 4 AND NOT 100
    @Test
    public void isYearDividableBy4Not100() {
        assertTrue(isLeapYear(2020));
    }

    // Here I test to see if the leap year is dividable by 400
    @Test
    public void isYearDividableBy400() {
        assertTrue(isLeapYear(2000));


    }

    // Here I test to see if the leap year is NOT dividable by 4
    @Test
    public void isYearNotDividableBy4() {
        assertFalse(isLeapYear(1703));
    }

    // Here I test to see if the leap year is dividable by 100 AND NOT 400
    @Test
    public void isYearDividableBy100Not400() {
        assertFalse(isLeapYear(1700));
    }

    public static class LeapYear {

        /**
         * This is a static boolean isLeapYear taking in an int variable that checks to see if it's a leap year.
         * It will return true if year is dividable by 4 AND if year is not dividable by 100
         * It will also return true if int year is dividable by 400
         * @param year year
         * @return boolean
         */
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }
}
