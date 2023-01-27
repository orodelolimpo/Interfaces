package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanasEjercicios03 extends JFrame {

	private JPanel contentPane;
	private JTextField textResultadoUsuario;
	private JTextField textField;
	private JButton btnAceptar;
	private String usuarioOK="lydia";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicios03 frame = new VentanasEjercicios03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanasEjercicios03() {
		setTitle("Iniciar Sesión");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][][]"));
		
		JLabel lbUsuario = new JLabel("Usuario");
		contentPane.add(lbUsuario, "cell 1 1");
		
		textResultadoUsuario = new JTextField();
		contentPane.add(textResultadoUsuario, "cell 3 1,growx");
		textResultadoUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		contentPane.add(lblContraseña, "cell 1 3");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 3 3,growx");
		textField.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textResultadoUsuario.getText()==null || textResultadoUsuario.getText().isBlank () || 
				textField.getText()==null 	||textField.getText().isBlank())  {
					JOptionPane.showMessageDialog(null,"Debe introducir un nombre","Dato no 						introducido",JOptionPane.ERROR_MESSAGE);
					return;
				}
					
				if (textField.getText().equals( usuarioOK)) {
					JOptionPane.showMessageDialog(null, "La contraseña es Correcta", "ENHORABUENA", 													JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Contraseña Incorrecta","ERROR INICIO 														SESIÓN",JOptionPane.ERROR_MESSAGE);
				}
				return;
			}

		});
		
		contentPane.add(btnAceptar, "cell 3 8,alignx right");
		
		
		}
	
	//protected void login(){
	//	 String user=txtUsuario.getText();
	//   String pass=txtPasssword.getText();
	
	//if (usser ==null || user.isBlack()|| pass==null ||PASS.ISbLANCK()){
//		JOptionPane.showMessageDialog(null,"Error.Debe rellenar los dos campos", "Error"", JOptionPane.ERROR_MESSAGE);
}
