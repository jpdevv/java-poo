package presentation.views;

import business.services.PrinterService;
import business.services.ReaderService;
import business.services.ValidationService;
import presentation.controller.MenuController;

public class Main {
    public static void main(String[] args) {
        ReaderService readerService = new ReaderService();
        PrinterService printerService = new PrinterService();
        MenuController menuController = new MenuController();
        ValidationService validationService = new ValidationService();
        
        while(true) {
            printerService.print("1 - Cadastrar\n2 - Excluir\n3 - Listar\n4 - Fechar\n");
            printerService.print("Escolha uma opção: ");
            String choice = readerService.nextLine();

            if(validationService.isInt(choice)) {
                int number = Integer.parseInt(choice);
                if(validationService.isOption(number)) {
                    menuController.showMenu(number);
                } else {
                    printerService.println("Apenas de 1 a 4!");
                }
            } else {
                printerService.printf("'%s' nao é válido!\n", choice);
            }
        }
    }
}
