import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class SmartBankingApp{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "Welcome to Smart Banking System";
        final String OPEN_ACCOUNT = "Open New Account";
        final String DEPOSIT_MONEY = "Deposit Money";
        final String WITHDRAW_MONEY = "Withdraw Money";  
        final String TRANSFER_MONEY = "Transfer Money";
        final String CHECK_ACCOUNT_BALANCE = "Check Accout Balance"; 
        final String DELETE_ACCOUNT = "Drop Existing Account";   

        String screen = DASHBOARD;
        
        do{
            final String APP_TITLE = String.format("%s%s%s",COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){
//==========================================================================================================================================
                case DASHBOARD:
//==========================================================================================================================================               
                    System.out.println("\t[1]. Open New Account: ");
                    System.out.println("\t[2]. Deposit Money: ");  
                    System.out.println("\t[3]. Withdraw Money: ");   
                    System.out.println("\t[4]. Transfer Money: ");  
                    System.out.println("\t[5]. Check Account Balance: ");
                    System.out.println("\t[6]. Drop Existing Account: "); 
                    System.out.println("\t[7]. Exit: \n");     
                    System.out.print("Enter the Option Number to Continue: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();
//------------------------------------------------------------------------------------------------------------------------------------------ 
                    switch(option){
                        case 1: screen = OPEN_ACCOUNT; break;
                        case 2: screen = DEPOSIT_MONEY; break;
                        case 3: screen = WITHDRAW_MONEY; break;
                        case 4: screen = TRANSFER_MONEY; break;
                        case 5: screen = CHECK_ACCOUNT_BALANCE; break;
                        case 6: screen = DELETE_ACCOUNT; break;
                        case 7: System.out.println(CLEAR); System.exit(0); break;
                        default: continue;
                    } 
//------------------------------------------------------------------------------------------------------------------------------------------ 
                    break;
//==========================================================================================================================================
                case OPEN_ACCOUNT:
//==========================================================================================================================================
                case DEPOSIT_MONEY:
                case WITHDRAW_MONEY:
                case TRANSFER_MONEY:
                case CHECK_ACCOUNT_BALANCE:
                case DELETE_ACCOUNT:
            }


        }while (true);
        
    }
}