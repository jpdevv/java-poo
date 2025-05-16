package presentation.controller;

import business.services.PrinterService;
import business.services.ValidationMenuService;

public class MenuController {
    ValidationMenuService validationMenuService = new ValidationMenuService();
    RegistrationController registrationController = new RegistrationController();
    PrinterService printerService = new PrinterService();

    public void showMenu(String input) {
        if(validationMenuService.isOption(input)) {
            switch (input) {
                case "1":
                    registrationController.showRegistrationMenu();
                    break;
                case "2":

                    break;
                case "3":
                
                    break;
                case "4":
                    printerService.println("Fechando o sistema...");
                    System.exit(0);
                    break;
                default:
                    printerService.println("Apenas de 1 a 4!");
                    break;
            }
        } else {
            printerService.printf("'%s' não é uma opção válida!\n", input);
        }
    }
}
