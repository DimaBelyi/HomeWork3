public class Main {
    public static void main(String[] args) {
//Задача №1
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 5.5f;
        double f = 6.66;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println(" ");
//Задача №2
        float aa = 27.12f;
        long bb = 987_678_965_549L;
        double cc = 2.786;
        short dd = 569;
        int ee = -159;
        int ff = 27897;
        byte gg = 67;
//Задача №3
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short sheetTotal = 480;
        int totalStudents = lpStudents + asStudents + eaStudents;
        int sheetStudent = sheetTotal / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetStudent + " листов бумаги");
        System.out.println();
//Задача №4
        int bottleMinute = 16 / 2;
        int bottle20Minute = 20 * bottleMinute;
        int bottleDay = 60 * 24 * bottleMinute;
        int bottle3Day = 3 * bottleDay;
        int bottleMomth = 30 * bottleDay;
        System.out.println("За 20 минут машина произвела " + bottle20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottle3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleMomth + " штук бутылок");
        System.out.println();
//Задача №5
        int canPaint = 120;
        int whiteCanPaint = 2;
        int brownCanPaint = 4;
        int totalKlass = canPaint / (whiteCanPaint + brownCanPaint);
        int totalWhiteCanPaint = totalKlass * whiteCanPaint;
        int totalBrownCanPaint = totalKlass * brownCanPaint;
        System.out.println("В школе, где " + totalKlass + " классов, нужно " + totalWhiteCanPaint +
                " банок белой краски и " + totalBrownCanPaint + " банок коричневой краски");
        System.out.println();
//Задача №6
        int bananas = 5 * 80;
        double milk = 200 * 1.05;
        int aciCream = 2 * 100;
        int agg = 4 * 70;
        double totalGm = bananas + milk + aciCream + agg;
        System.out.println("Вес завтрака в гаммах " + totalGm);
        System.out.println("Вес завтрака в килограмах " + totalGm / 1000);
        System.out.println();

//Задача №7
        int kgMinus = 7;
        int gm250 = 250;
        int gm500 = 500;
        int totalDay250 = (kgMinus * 1000) / gm250;
        int totalDay500 = (kgMinus * 1000) / gm500;
        System.out.println("При сбросе веса на 250 грамм потребуется " + totalDay250 + " дней");
        System.out.println("При сбросе веса на 500 грамм потребуется " + totalDay500 + " дней");
        System.out.println("В соеднем на сброс веcа на 7 кг потребуется " +
                (totalDay250 + totalDay500) / 2 + " дней");
        System.out.println();
//Задача №8
        int zpMasha = 67_760;
        int zpDenis = 83_690;
        int zpKris = 76_230;
        double zpUpMasha = zpMasha * 1.1;
        float zpUpDenis = zpDenis * 1.1f;
        double zpUpKris = zpKris * 1.1;
        System.out.println("Маша теперь получает " + zpUpMasha + " рублей. Годовой" +
                " доход вырос на " + ((zpUpMasha * 12) - (zpMasha * 12)) + " рублей");
        System.out.println("Денис теперь получает " + zpUpDenis + " рублей. Годовой" +
                " доход вырос на " + ((zpUpDenis * 12) - (zpDenis * 12)) + " рублей");
        System.out.println("Кристина теперь получает " + zpUpKris + " рублей. Годовой" +
                " доход вырос на " + ((zpUpKris * 12) - (zpKris * 12)) + " рублей");
        System.out.println();
    }
}