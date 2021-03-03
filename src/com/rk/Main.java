package com.rk;

public class Main implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Main());
        t.start();

        System.out.printf("Hasilnya adalah  = %d", 1);
        t.join();

        System.out.printf("\nSetelah Join, Hasilnya adalah  = %d", 2);
    }

    @Override
    public void run() {
        System.out.printf("%d", 3);
    }
}
