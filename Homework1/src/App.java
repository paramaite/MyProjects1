/**
 * Created by Anreios on 05.07.15.
 */
public class App {

    public static void main(String[] args) {
        Palatka myPalatka = new Palatka(3, 8, 20, 3, 2, 1);   //Вводим аргументы необходимых размеров палатки myPalatka

        System.out.println("Высота основания " + myPalatka.visotaOsnovaniya + "; Ширина " + myPalatka.shirinaOsnovaniya +
                "; Длина " + myPalatka.dlina + "; Высота крыши " +  myPalatka.visotaKrishi + "; Высота дверей " + myPalatka.visotaDverey + "; Ширина дверей " + myPalatka.shirinaDverey);
        System.out.println(" Количество необходимого материала для постройки палатки myPalatka " + myPalatka.square() + "м2");

        Palatka myPalatka2 = new Palatka(2.5, 10, 15, 2.3, 2, 1);   //Вводим аргументы необходимых размеров палатки myPalatka2

        System.out.println("Высота основания " + myPalatka2.visotaOsnovaniya + "; Ширина " + myPalatka2.shirinaOsnovaniya +
                "; Длина " + myPalatka2.dlina + "; Высота крыши " +  myPalatka2.visotaKrishi + "; Высота дверей " + myPalatka2.visotaDverey + "; Ширина дверей " + myPalatka2.shirinaDverey);
        System.out.println(" Количество необходимого материала для постройки палатки myPalatka2 " + myPalatka2.square() + "м2");

        System.out.println("я вас всех порву");
    }
}