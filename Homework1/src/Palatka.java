/**
 * Created by Anreios on 05.07.15.
 */
public class Palatka {           //Палатка имеет прямоугольную форму и двускатную крышу, и одни двери
    double visotaOsnovaniya;
    double shirinaOsnovaniya;
    double dlina;
    double visotaKrishi;
    double visotaDverey;
    double shirinaDverey;

    Palatka(double visotaOsnovaniya, double shirinaOsnovaniya, double dlina, double visotaKrishi, double visotaDverey, double shirinaDverey){  //cоставляем конструктор класса Palatka
        this.visotaOsnovaniya = visotaKrishi;
        this.shirinaOsnovaniya = shirinaOsnovaniya;
        this.dlina = dlina;
        this.visotaKrishi = visotaKrishi;
        this.visotaDverey = visotaDverey;
        this.shirinaDverey = shirinaDverey;

    }
    double square(){  //Расчитываем площадь материала необходимого для постройки палатки
        return ((visotaOsnovaniya * shirinaOsnovaniya + visotaOsnovaniya * dlina + (Math.sqrt(Math.pow(visotaKrishi, 2) + Math.pow(shirinaOsnovaniya / 2, 2))) * dlina + shirinaOsnovaniya / 2 * visotaKrishi) * 2) - visotaDverey * shirinaDverey;
    }
}