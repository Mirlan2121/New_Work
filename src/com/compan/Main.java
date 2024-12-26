package com.compan;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void printCounter(int counter, String text)throws InterruptedException {
        System.out.println(text);
        for (int i = counter; i >= 0; i--){
            System.out.println(i + "...");
            TimeUnit.SECONDS.sleep(1);
        }

    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Иду на кухню");
        int eqqCount = 2;
        int eqqToFry = 5;
        boolean haveButter = true;
        boolean haveSalt = true;
        boolean panClean = false;
        if(eqqCount < eqqToFry){
            System.out.println(
                    String.format("Иду в магазин за яйцами и покупаю %d шт",
                            eqqToFry - eqqCount)
            );
        }
            if (!haveButter || !haveSalt){
            System.out.println("Иду в магазин за солью и маслом");
        }
        if (!panClean){
            int washTime = 3;
            System.out.println("Надо помыть сковородку, мою...");
            TimeUnit.SECONDS.sleep(washTime);
            System.out.println("Чтобы помыть ушло" + washTime + " секунд");
        }
        System.out.println("Ставим сковородку на плиту");
        System.out.println("Зажигаем газ");
        System.out.println("Налили масло в сковородку, ждем пока нагреется...");
        int headTime = 2;
        System.out.println("Масло нагрелось, разбиваем яйца");
        System.out.println("Добавляем соль");
        System.out.println("Ждем пока пожарятся...");
        int flyTime = 5;
        TimeUnit.SECONDS.sleep(flyTime);
        System.out.println("Яичница готова, выключаем газ");
        System.out.println("Накладываем в тарелку");
    }
}
