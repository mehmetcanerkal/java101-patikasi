package Giris;
import java.util.Scanner;
public class cinZodiac {
    public static void main(String[] args) {
        int dogumT,mod;
        String cvp = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum tarihini giriniz : ");
        dogumT = input.nextInt();
        mod = dogumT%12;

        if(mod == 0){
            cvp = "maymun";
        }

        if(mod == 1){
            cvp = "horoz";
        }


        if(mod == 2){
            cvp = "köpek";
        }


        if(mod == 3){
            cvp = "domuz";
        }

        if(mod == 4){
            cvp = "fare";
        }

        if(mod == 5){
            cvp = "öküz";
        }

        if(mod == 6){
            cvp = "kaplan";
        }


        if(mod == 7){
            cvp = "tavşan";
        }

        if(mod == 8){
            cvp = "ejderha";
        }

        if(mod == 9){
            cvp = "yılan";
        }


        if(mod == 10){
            cvp = "at";
        }

        if(mod == 11){
            cvp = "koyun";
        }

        System.out.println(cvp);
    }
}
