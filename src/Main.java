import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Иду на кухню");
        int eggCount = 2;
        int eggToFry = 5;
        boolean haveButter = true;
        boolean haveSalt = true;
        boolean panClean = false;
        if (eggCount < eggToFry) {
            System.out.println(String.format("Иду в магазин за яйцами и  покупаю %s яиц", eggToFry - eggCount)
            );
        }
        if (!haveButter || haveSalt) {
            System.out.println("Иду магазин за солью и маслом");
        }

        if (!panClean) {
            int washTime = 3;
            System.out.println("Надо помыть сковородку, мою...");
            TimeUnit.SECONDS.sleep(washTime);
            System.out.println("Чтобы помыть лучше " + washTime + "секунд");
        }
        System.out.println("Ставим сковородку на плиту");
        System.out.println("Зажигаем газ");
        System.out.println("Налили маслов сковородку, ждем пока нагреется... ");
        int heatTime = 2;
        TimeUnit.SECONDS.sleep(heatTime);
        System.out.println("Масло нагрелось, разбиваем яйца");
        System.out.println("Добавляем соль");
        System.out.println("Ждем пока пожарится.... ");
        int fryTime = 5;
        TimeUnit.SECONDS.sleep(fryTime);
        System.out.println("Яичница готова, выключаем газ");
        System.out.println("Накладываем в тарелку");

    }

}
