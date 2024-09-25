import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TDAVector2D {
    private JPanel pGeneral;
    private JTextArea txtResultado;
    private JTextField txtV1X;
    private JTextField txtV1Y;
    private JTextField txtV2Y;
    private JButton btnCalcular;
    private JTextField txtV2X;
    private JButton btnLimpiar;

    // Crear dos vectores
    Vector2D v1, v2;
    public TDAVector2D() {

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Vector2D v1 = new Vector2D(Integer.parseInt(txtV1X.getText()), Integer.parseInt(txtV1Y.getText()));
                Vector2D v2 = new Vector2D(Integer.parseInt(txtV2X.getText()), Integer.parseInt(txtV2Y.getText()));



                //Vectores
                txtResultado.append("\nv1= ("+v1.getX()+"i+"+v1.getY()+"j)");
                txtResultado.append("\nv2= ("+v2.getX()+"i+"+v2.getY()+"j)");
                // Mostrar magnitudes
                txtResultado.append("\nMagnitud de v1: " + v1.magnitud());
                txtResultado.append("\nMagnitud de v2: " + v2.magnitud());

                // Sumar vectores
                Vector2D suma = v1.sumar(v2);
                txtResultado.append("\nSuma de v1 y v2: " + suma);  // Debería ser (4, 6)

                // Producto escalar
                double producto = v1.productoEscalar(v2);
                txtResultado.append("\nProducto escalar de v1 y v2: " + producto);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText("");
                txtV1X.setText("");
                txtV1Y.setText("");
                txtV2X.setText("");
                txtV2Y.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TDAVector2D");
        frame.setContentPane(new TDAVector2D().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
