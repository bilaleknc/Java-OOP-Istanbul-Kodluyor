import java.util.Scanner;

public class firstHomeWork {

        public static void main(String[] args) {

            int     number = 0;
            double  dollarToday;
            double  dollarYesterday;
            double  moneyAccount;

            dollarYesterday = 27.90;

            Scanner scanner = new Scanner(System.in);
            clearScreen();

            System.out.println("\t\t\t--------- Welcome Bilal Money Exchange Center -------\n\n\t\t\t");

            dollarToday = getInput(scanner, "Enter dollar exchange rate: ");
            while (dollarToday < 0)
                dollarToday = getInput(scanner, "Enter dollar exchange rate: ");

            moneyAccount = getInput(scanner, "Enter amount in your tl account: ");
            while (moneyAccount < 0)
                moneyAccount = getInput(scanner, "Enter dollar exchange rate: ");

            //clearScreen();
            while (number != 3)
                number = enterChoice(scanner, moneyAccount, dollarToday);
            clearScreen();
            System.out.println("By by\n");
            scanner.close();



        }

        public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        public static double getInput(Scanner scanner, String str) {
            double  input;

            System.out.print(str);
            String dollarToday = scanner.nextLine();
            try {
                input = Double.parseDouble(dollarToday);
            }
            catch(Exception e)
            {
                System.out.println("Please enter as digits, Example 548.62");
                input = getInput(scanner, str);
            }
            return (input);
        }

        public static int   enterChoice(Scanner scanner, double money, double rate)
        {
            String  numberStr;
            int     number;

            System.out.println("\n1-) Learn your account amount");
            System.out.println("2-) Change your money as dollar");
            System.out.println("3-) Exit");
            System.out.print("Yapmak istediğiniz işlemin numarasını giriniz:  ");

            numberStr = scanner.nextLine();
            try {
                number = Integer.parseInt(numberStr);
            }
            catch(Exception e)
            {
                System.out.println("Please enter as digits, Example 1 or 2");
                number = enterChoice(scanner, money, rate);
            }
            while (number < 1 || number > 3)
                number = enterChoice(scanner, money, rate);

            switch (number) {
                case 1:
                    System.out.println("Amount your account: " + money);
                    break;
                case 2:
                    System.out.println("Amount your account as dollar: " + (money / rate));
                    break;
            }
            return (number);
        }

}