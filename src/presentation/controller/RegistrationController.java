package presentation.controller;

import business.services.PrinterService;
import business.services.ReaderService;
import business.services.ValidationMenuService;

public class RegistrationController {
    PrinterService printerService = new PrinterService();
    ReaderService readerService = new ReaderService();
    ValidationMenuService validationMenuService = new ValidationMenuService();
    
    public void showRegistrationMenu() {
        printerService.println("---------- CADASTRO ----------");
        printerService.println("1 - Disciplina\n2 - Estudante\n3 - Estudante em uma disciplina");
        printerService.print("O que deseja cadastrar? ");
        String input = readerService.nextLine();

        if(validationMenuService.isRegistrationOption(input)) {
            switch (input) {
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                default:
                    printerService.println("Apenas de 1 a 3!");
                    break;
            }
        } else {
            printerService.printf("'%s' não é uma opção válida!\n", input);
        }
    }
}
