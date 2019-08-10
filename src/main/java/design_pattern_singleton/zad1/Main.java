package design_pattern_singleton.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PostOffice postOffice = new PostOffice();

        String line = null;
        do {
            System.out.println("What ticket to generate?\n1 - Machine\n2 - Registry\n3 - Internet\nWrite 'quit' to quit");
            line = scanner.nextLine();

            switch (line) {
                case "1":
                    System.out.println(postOffice.generateTicketMachine());
                    break;
                case "2":
                    System.out.println(postOffice.generateTicketRegistry());
                    break;
                case "3":
                    System.out.println(postOffice.generateTicketInternet());
                    break;
                default:
                    if (line.equalsIgnoreCase("quit")) {
                        continue;
                    } else {
                        System.err.println("Wrong input! Try again.");
                    }
            }
        } while (!line.equalsIgnoreCase("quit"));
    }
}
