import javax.swing.*;

public class iniciosesion extends JFrame {
    private JPanel panel1;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton INGRESARButton;

    public iniciosesion() {
        super("BANCO PICHINCHA");
        setContentPane(panel1);
        this.setLocationRelativeTo(null);
        INGRESARButton.addActionListener(e -> {
            String usuarioCorrecto = "S";
            String passwordCorrecto = "2003";

            try {
                String usuarioIngresado = txtUser.getText();
                String passwordIngresado = txtPass.getText();

                if (usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto)) {
                    JOptionPane.showMessageDialog(panel1, "Ingreso de manera exitosa");
                    JOptionPane.showMessageDialog(panel1, "Bienvenido al sistema " + usuarioIngresado);
                    Menu_Opciones ventana = new Menu_Opciones();
                    ventana.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(panel1, "Intenta otra vez.\n El usuario o contraseña es incorrecto.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel1, "Error al procesar la contraseña. Asegúrate de ingresar solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
