package presentation.views;

import business.services.PrinterService;
import business.services.ReaderService;
import presentation.controller.MenuController;

public class Main {
    public static void main(String[] args) {
        PrinterService printerService = new PrinterService();
        MenuController menuController = new MenuController();
        ReaderService readerService = new ReaderService();

        while(true) {
            printerService.println("---------- MENU ----------");
            printerService.println("1 - Cadastrar\n2 - Deletar\n3 - Listar\n4 - Fechar");
            printerService.print("O que deseja fazer? ");
            String input = readerService.nextLine();
            menuController.showMenu(input);
        }
    }
}
