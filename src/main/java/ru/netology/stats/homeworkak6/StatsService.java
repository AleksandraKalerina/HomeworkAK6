package ru.netology.stats.homeworkak6;

public class StatsService {
    public int calculateSumSale(long[] sales) {
        int sum = 0;
        for (long s : sales) {
            sum += s;
        }
        return sum;
    }

    public int averageSumSale(long[] sales) {
        return calculateSumSale(sales) / sales.length;

    }

    public int maxSumSale(long[] sales) {
        int maxMonth = 0;

        for (int s = 0; s < sales.length; s++) {
            if (sales[s] >= sales[maxMonth]) {
                maxMonth = s;
            }
        }
        return maxMonth + 1;
    }

    public int minSumSale(long[] sales) {
        int minMonth = 0;
        for (int s = 0; s < sales.length; s++) {
            if (sales[s] <= sales[minMonth]) {
                minMonth = s;
            }
        }
        return minMonth + 1;
    }

    public int getMinSale(long[] sales) {
        int minSale = 0;
        for (int s = 0; s < sales.length; s++) {
            if (sales[s] <= averageSumSale(sales)) {
                minSale++;
            }
        }
        return minSale;
    }

    public int getMaxSale(long[] sales) {
        int maxSale = 0;
        for (int s = 0; s < sales.length; s++) {
            if (sales[s] >= averageSumSale(sales)) {
                maxSale++;
            }
        }
        return maxSale;
    }
}
