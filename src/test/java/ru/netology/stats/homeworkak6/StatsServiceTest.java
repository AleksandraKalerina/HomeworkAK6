package ru.netology.stats.homeworkak6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSaleForPeriod() {
        StatsService service = new StatsService();
        long[] sales = {1000, 1100, 1200, 2000, 2200, 3000, 3100, 4000, 4200, 5000, 5100, 6000};

        int expectedSum = 37_900;
        int actualSum = service.calculateSumSale(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void sumSaleAverage() {
        StatsService service = new StatsService();
        long[] sales = {1000, 1100, 1200, 2000, 2200, 3000, 3100, 4000, 4200, 5000, 5100, 6000};

        int expectedAver = 3_158;
        int actualAver = service.averageSumSale(sales);

        Assertions.assertEquals(expectedAver, actualAver);
    }

    @Test
    public void numberMonthMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {6000, 1100, 1200, 2000, 2200, 3000, 3100, 4000, 4200, 5000, 5100, 1000};

        int expectedNumMax = 1;
        int actualNumMax = service.maxSumSale(sales);

        Assertions.assertEquals(expectedNumMax, actualNumMax);
    }

    @Test
    public void numberMonthMinSale() {
        StatsService service = new StatsService();
        long[] sales = {4000, 1100, 1200, 2000, 2200, 3000, 3100, 1000, 4200, 5000, 5100, 6000};

        int expectedNumMin = 8;
        int actualNumMin = service.minSumSale(sales);

        Assertions.assertEquals(expectedNumMin, actualNumMin);
    }

    @Test
    public void lessAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {1000, 1100, 1200, 2000, 2200, 3000, 3100, 4000, 4200, 5000, 5100, 6000};

        int expectedLessAver = 7;
        int actualLessAver = service.getMinSale(sales);

        Assertions.assertEquals(expectedLessAver, actualLessAver);
    }

    @Test
    public void moreAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {1000, 1100, 1200, 2000, 2200, 3000, 3100, 4000, 4200, 5000, 5100, 6000};

        int expectedMoreAver = 5;
        int actualMoreAver = service.getMaxSale(sales);

        Assertions.assertEquals(expectedMoreAver, actualMoreAver);
    }
}
