package ru.netology.sqr;

public class SQRService {

    public int sqrNumberAmount() {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= 200 && sqr <= 300) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
