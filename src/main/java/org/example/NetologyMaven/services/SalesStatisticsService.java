package org.example.NetologyMaven.services;

public class SalesStatisticsService {
    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int middleSales(long[] sales) {
        int sum = 0;
        int middle = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
            middle = sum / sales.length;
        }
        return middle;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int mouthsWithMinMiddleSales(long[] sales) {
        int daysWithMinMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middleSales(sales)) {
                daysWithMinMonth += 1;
            }
        }

        return daysWithMinMonth;
    }

    public int mouthsWithMaxMiddleSales(long[] sales) {
        int daysWithMaxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middleSales(sales)) {
                daysWithMaxMonth += 1;
            }
        }

        return daysWithMaxMonth;
    }
}



