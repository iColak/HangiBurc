package kosulluIfadeler;
import java.util.Scanner;

public class HangiBurc {
    public static void main(String[] args) {
        int gun;
        String ay;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner (System.in);
        System.out.print("Hangi ayda doğdunuz? ");
        ay = input.nextLine();
        System.out.print("Ayın kaçında doğdunuz? ");
        gun = input.nextInt();

        if (ay.equals("ocak")) {
            if (gun >= 1 && gun <= 31){
                if (gun < 22) burc = "Oğlak";
                else burc = "Kova";
            } else {
                isError = true;
            }

        } else if (ay.equals("şubat")) {
            if (gun >= 1 && gun <= 29){
                if (gun < 20) burc = "Kova";
                else burc = "Balık";
            } else {
                isError = true;
            }

        } else if (ay.equals("mart")) {
            if (gun >= 1 && gun <= 31){
                if (gun < 20) burc = "Balık";
                else burc = "Koç";
            } else {
                isError = true;
            }

        } else if (ay.equals("nisan")) {
            if (gun >= 1 && gun <= 30){
                if (gun < 21) burc = "Koç";
                else burc = "Boğa";
            } else {
                isError = true;
            }

        } else if (ay.equals("mayıs")) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) burc = "Boğa";
                else burc = "İkizler";
            } else {
                isError = true;
            }

        } else if (ay.equals("haziran")) {
            if (gun >= 1 && gun <= 30){
                if (gun < 23) burc = "İkizler";
                else burc = "Yengeç";
            } else {
                isError = true;
            }

        } else if (ay.equals("temmuz")) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) burc = "Yengeç";
                else burc = "Aslan";
            } else {
                isError = true;
            }

        } else if (ay.equals("ağustos")) {
            if (gun >= 1 && gun <= 31){
                if (gun < 23) burc = "Aslan";
                else burc = "Başak";
            } else {
                isError = true;
            }

            } else if (ay.equals("eylül")) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23) burc = "Başak";
                else burc = "Terazi";
            } else {
                isError = true;
            }

        } else if (ay.equals("ekim")) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) burc = "Terazi";
                else burc = "Akrep";
            } else {
                isError = true;
            }

        } else if (ay.equals("kasım")) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 22) burc = "Akrep";
                else burc = "Yay";
            } else {
                isError = true;
            }

        } else if (ay.equals("aralık")) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) burc = "Yay";
                else burc = "Oğlak";
            } else {
                isError = true;
            }

        } else isError = true;

        if (isError == true) System.out.println("Hatalı giriş yaptınız, lütfen yeniden deneyiniz");
        else System.out.println("Burcunuz: " + burc + " Burcu");

    }
}
