import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorMoedas extends JFrame {
    private JComboBox comboBox1;
    private JTextField valorConverter;
    private JButton yuanChines;
    private JButton dolar;
    private JButton euro;
    public JPanel conversorMoeda;
    private JTextField valorConvertido;


    public ConversorMoedas() {
    euro.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Double valorEuroInformado = Double.valueOf(valorConverter.getText());

            Double valorFinal = valorEuroInformado * 5.33;

            valorConvertido.setText(valorFinal.toString());

        }
    });
        dolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Double valorDolarInformado = Double.valueOf(valorConverter.getText());

                Double valorFinal = valorDolarInformado * 4.33;

                valorConvertido.setText(valorFinal.toString());

            }
        });


        yuanChines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valorYoanInformado = Double.valueOf(valorConverter.getText());

                Double valorFinal = valorYoanInformado * 0.73;

                valorConvertido.setText(valorFinal.toString());
            }
        });
    }
}
