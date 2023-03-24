package org.example.NetologyMaven.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SalesStatisticsServiceTest {

    @Test
    public void findSumSales() {
        SalesStatisticsService service = new SalesStatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectSalesStatisticsService = 180;
        int actualSalesStatisticsService = service.sumSales(sales);

        Assertions.assertEquals(expectSalesStatisticsService, actualSalesStatisticsService);

    }

    @Test
    public void findMidSales() {
        SalesStatisticsService service = new SalesStatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectSalesStatisticsService = 15;
        int actualSalesStatisticsService = service.middleSales(sales);

        Assertions.assertEquals(expectSalesStatisticsService, actualSalesStatisticsService);

    }

    @Test
    public void findDayWithMinSales() {
        SalesStatisticsService service = new SalesStatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectSalesStatisticsService = 9;
        int actualSalesStatisticsService = service.minSales(sales);

        Assertions.assertEquals(expectSalesStatisticsService, actualSalesStatisticsService);

    }

    @Test
    public void findDayWithMaxSales() {
        SalesStatisticsService service = new SalesStatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectSalesStatisticsService = 8;
        int actualSalesStatisticsService = service.maxSales(sales);

        Assertions.assertEquals(expectSalesStatisticsService, actualSalesStatisticsService);

    }

    @Test
    public void findScoreDaysDownMidSales() {
        SalesStatisticsService service = new SalesStatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectSalesStatisticsService = 5;
        int actualSalesStatisticsService = service.mouthsWithMinMiddleSales(sales);

        Assertions.assertEquals(expectSalesStatisticsService, actualSalesStatisticsService);

    }

    @Test
    public void findScoreDaysAboveMidSales() {
        SalesStatisticsService service = new SalesStatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectSalesStatisticsService = 5;
        int actualSalesStatisticsService = service.mouthsWithMaxMiddleSales(sales);

        Assertions.assertEquals(expectSalesStatisticsService, actualSalesStatisticsService);

    }

}
