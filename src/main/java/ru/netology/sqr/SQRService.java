package ru.netology.sqr;

public class SQRService {

    public int sqrNumberAmount(int from, int to) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= from && sqr <= to) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
