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

public class VentanaEjercicio01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjercicio01 frame = new VentanaEjercicio01();
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
	public VentanaEjercicio01() {
		setTitle("Ventana con interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][110.00][][][][grow]", "[][]"));
		
		JLabel lblIndicacion = new JLabel("Has pulsado:");
		contentPane.add(lblIndicacion, "cell 1 1");
		
		JLabel lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 2 1 2 1");
		
		
		
		JButton btnBoton1 = new JButton("Botón1");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText("Botón 1");
			}
		});
		contentPane.add(btnBoton1, "cell 4 1,alignx center");
		/////
		
		JButton btnBoton2 = new JButton("Botón2");
		contentPane.add(btnBoton2, "cell 6 1,growx");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText("Botón 2");
			}
		});
	}

}
