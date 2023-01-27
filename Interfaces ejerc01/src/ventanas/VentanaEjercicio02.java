package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEjercicio02 extends JFrame {

	private JPanel contentPane;
	private int contadorb1 =0;
	private JLabel lblResultadoBoton1;
	private int contadorb2=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjercicio02 frame = new VentanaEjercicio02();
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
	public VentanaEjercicio02() {
		setTitle("Ventana con más interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][69.00][33.00][][][grow]", "[][][][][]"));
		
		JLabel lblBoton1 = new JLabel("Botón 1:");
		contentPane.add(lblBoton1, "cell 1 1");
		
		JLabel lblBoton2 = new JLabel("Botón 2:");
		contentPane.add(lblBoton2, "cell 4 1");
		
		JLabel lblResultadoBoton2 = new JLabel("");
		contentPane.add(lblResultadoBoton2, "cell 5 1");
		
		JButton btnBoton1 = new JButton("Botón 1");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				contadorb1++;
				lblResultadoBoton1.setText(" "+contadorb1+ "  Veces");
			}
		});
		contentPane.add(btnBoton1, "cell 2 4");
		
		JButton btnBoton2 = new JButton("Botón 2");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorb2++;
				lblResultadoBoton2.setText(" "+contadorb2+ "  Veces");
			
			
			}
		});
		contentPane.add(btnBoton2, "cell 5 4");
		
		lblResultadoBoton1 = new JLabel("");
		contentPane.add(lblResultadoBoton1, "cell 2 1");
	}

}
