package logowanie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String login="a", password="a";

        System.out.println("Witamy w naszym banku !!!");
        System.out.println("W celu identyfikacji podaj swoje ID oraz hasło.");

            Scanner input = new Scanner(System.in);

           for(int i=3; i>=0;i--) {
               System.out.println();
               System.out.print("Podaje swoje ID: ");
               String id = input.nextLine();

               System.out.print("Podaj swoje haslo: ");
               String haslo = input.nextLine();

               if (id.equals(login) && haslo.equals(password)) {
                   System.out.println("Poprawne dane zostałeś zalogowany..");

                       double stanKonta = 1000.00;
                       System.out.println("Stan twoje konta wynosi " + stanKonta + " PLN");


                                System.out.println("Co chcesz zrobic ?");



                                System.out.println("1 - Wpłać ");
                                System.out.println("2 - Wypłać");
                                System.out.println("3 - Wyjdz");

                                Scanner wyb = new Scanner(System.in);
                                int oper = wyb.nextInt();
                                
                                for (int a = 1; 3 > oper; a++) {

                                    if (oper == 1) {
                                        System.out.print("Podaj kwotę do wpłaty: ");
                                        Scanner wplata = new Scanner(System.in);
                                        double wplac = wplata.nextDouble();
                                        double nowyStanKonta = stanKonta + wplac;
                                        System.out.println("Obecy stan konta wynosi: " + nowyStanKonta + " PLN");
                                        break;

                                    } else if (oper == 2) {
                                        System.out.println("Jaka kwotę chcesz wypłacić: ");
                                        Scanner wyplata = new Scanner(System.in);
                                        double wyplac = wyplata.nextDouble();
                                        if (stanKonta < wyplac) {
                                            System.out.println("Nie masz wystarczającej ilości środków!!!");
                                        } else {
                                            double nowyStanKonta = stanKonta - wyplac;
                                            System.out.println("Wyplaciłeś: " + wyplac + " PLN" + " obecny stan konta wynosi: " + nowyStanKonta + " PLN");
                                        }
                                    } else {
                                        return;
                                    }
                                }

               } else {
                   System.out.println("Błędny login lub hasło!!!");

                   if(i!=0)
                   {
                       System.out.println("Spróbuj ponownie, pozostały "+ i + " szanse.");
                   }else
                   {
                       System.out.println("Twoje konto zostało zablokowane. Skontaktuj sie z bankiem!!!!");
                   }
               }

           }
    }
}
