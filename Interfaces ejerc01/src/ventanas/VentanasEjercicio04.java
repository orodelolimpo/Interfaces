package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanasEjercicio04 extends JFrame {

	private JPanel contentPane;
	private JButton btnHabilita;
	private JButton btnCentral;
	private JButton btnDeshabilita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicio04 frame = new VentanasEjercicio04();
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
	public VentanasEjercicio04() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][][][][grow]", "[]"));
		
		btnDeshabilita = new JButton("Deshabililita Central");
		btnDeshabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activa1();				
			}
		});
		contentPane.add(btnDeshabilita, "cell 1 0");
		
		btnCentral = new JButton("Central");
		contentPane.add(btnCentral, "cell 3 0");
		
		btnHabilita = new JButton("Habilita Central");
		btnHabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activa2();
			}
		});
				
		btnHabilita.setEnabled(false);
		contentPane.add(btnHabilita, "cell 5 0");
	}
	public void activa1 () {
		btnDeshabilita.setEnabled(false);
		btnCentral.setEnabled(false);
		btnHabilita.setEnabled(true);
		
	}
	public void activa2 () {
		btnDeshabilita.setEnabled(true);
		btnCentral.setEnabled(true);
		btnHabilita.setEnabled(false);
	}
}
