package com.expedia.utilities;

import java.math.BigDecimal;

public class Utils {

    public static boolean areEqual(BigDecimal first, BigDecimal second) {
        return first.compareTo(second) == 0;
    }

    public static boolean firstGreaterThanSecond(BigDecimal first, BigDecimal second) {
        return second.compareTo(first) == 1;
    }

    public static boolean firstLessThanSecond(BigDecimal first, BigDecimal second) {
        return first.compareTo(second) == -1;
    }

}
