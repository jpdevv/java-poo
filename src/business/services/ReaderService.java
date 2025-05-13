package business.services;

import java.util.Scanner;

public class ReaderService {
    Scanner scanner = new Scanner(System.in);

    public String nextLine() {
        return scanner.nextLine();
    }
}
