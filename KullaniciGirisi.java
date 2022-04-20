package patikaodev;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName="patika",MainPassword="java123",choosen,password;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı giriniz ");
        userName=inp.nextLine();

        if (userName.equals("patika")) {
            System.out.print("Lütfen şifrenizi giriniz ");
            password = inp.nextLine();
            if (password.equals(MainPassword)) {
                System.out.println("Sisteme giriş yaptınız......");
            } else
            System.out.println("Şifrenizi hatalı girdiniz.Şifrenizi sıfırlamak ister misiniz? E EVET H HAYIR");
            choosen = inp.nextLine();

            switch (choosen) {

                case "E":
                    System.out.println("Yeni şifrenizin ilk şifreniz ile aynı olmamamsı gerekmektedir!");
                    System.out.println("Lütfen yeni şifrenizi giriniz");
                    password = inp.nextLine();
                    if (password.equals(MainPassword)) {
                        System.out.println("Şifre oluşturulamadı,yeniden deneyiniz");
                    } else System.out.println("Şifreniz başarı ile oluşturulmuştur");
                    break;

                case "H":
                    System.out.println("Şifreniz değiştirilmedi");
                    break;

                default:
                    System.out.println("Yanlış veri girdiniz,");
                    break;
            }
        }
         else System.out.println("Kullanıcı adını yanlış girdiniz.Lütfen yeniden deneyin");




}
}
