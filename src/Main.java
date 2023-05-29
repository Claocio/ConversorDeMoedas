import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {

        ConversorMoedas form = new ConversorMoedas();

        form.setContentPane(form.conversorMoeda);
        form.setVisible(true);
        form.setTitle("Calculadora");
        form.setSize(300,500);


        }
    }
