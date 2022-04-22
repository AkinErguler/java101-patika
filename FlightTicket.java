package patika101;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        double firstFlightFare,lastFlightFare=0,farePerDistance=0.10;
        int flightDistance, age;
        byte flyingType;//1- Tek Yön 2-Gidiş Dönüş

        Scanner inp = new Scanner(System.in);
        //input variable check flightDistance,age,flyingType

        System.out.print("Please enter your flight distance in 'km' ");
        flightDistance = inp.nextInt();

        if (flightDistance <= 0) {
            System.out.println("You entered incorrect data. Please try again.");}

        System.out.print("Please enter the passenger age ");
        age = inp.nextInt();

        if (age <= 0) {
            System.out.println("You entered incorrect data. Please try again");}

        System.out.print("Please enter your flying type ");
        flyingType = inp.nextByte();

        if (flyingType != 1 && flyingType != 2) {
            System.out.println("You entered incorrect data. Please try again");}

        //calculate First Flight Fare

        firstFlightFare=farePerDistance*flightDistance;

        //pessenger age check
        if(age<12) {
            lastFlightFare = (firstFlightFare - firstFlightFare * 0.5);
            if (flyingType == 2) { lastFlightFare=2*(lastFlightFare - lastFlightFare * 0.2);}

        }

       else if(age>=12&&age<=24){
            lastFlightFare=(firstFlightFare-firstFlightFare*0.1);

            if(flyingType==2){lastFlightFare=2*(lastFlightFare-lastFlightFare*0.2);}
       }

       else if(age>=65){
           lastFlightFare=(firstFlightFare-firstFlightFare*0.3);
            if(flyingType==2){lastFlightFare=2*(lastFlightFare-lastFlightFare*0.2);}
        }
       else{lastFlightFare=firstFlightFare;}

        System.out.println("Non-Discounted Fare "+ firstFlightFare+"TL");
        System.out.println("Discounted Fare "+ lastFlightFare+"TL");


    }
}
