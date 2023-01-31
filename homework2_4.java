import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class homework2_4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(homework2_4.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        double num1;
        double num2;
        double ans;
        char op;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Введите через пробел два числа: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
            System.out.print("\nВведите один из операторов (+, -, *, /): \n");
            op = reader.next().charAt(0);            
        }
        switch(op) {        
           case '+': ans = num1 + num2;
              break;
           case '-': ans = num1 - num2;
              break;
           case '*': ans = num1 * num2;
              break;
           case '/': ans = num1 / num2;
              break;
           default: logger.log(Level.WARNING, "Input error, try again."); 
              return;        
        }
        
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        
        logger.info("Test log");
        
    }
    
}
