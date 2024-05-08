import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Gabriel Santos
 * @since 04/05/2024
 * @version 1.0.0
 */
public class ContaTerminal {

    public static void main(String[] args)throws InterruptedException{
        MenuInicial menuInicial = new MenuInicial();

        System.out.print("Seja bem-vindo(a) ao banco digital DIO!!");

        menuInicial.executar();

    }



}
