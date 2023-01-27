package ventanas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanasEjercicio06 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup grupoColores = new ButtonGroup();
	private JTextPane textPane;
	private JRadioButton rdbRojo;
	private JRadioButton rdbVerde;
	private JRadioButton rdbMagenta;
	private JRadioButton rdbAzul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicio06 frame = new VentanasEjercicio06();
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
	public VentanasEjercicio06() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[45.00][][grow][]", "[][][][][][][][grow]"));
		
		JLabel lblSeleccionaUnColor = new JLabel("Selecciona un color");
		lblSeleccionaUnColor.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblSeleccionaUnColor, "cell 0 1 2 1");
		
		rdbAzul = new JRadioButton("Azul");
		rdbAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar (Color.BLUE);
			}
		});
		rdbAzul.setSelected(true);
		grupoColores.add(rdbAzul);
		contentPane.add(rdbAzul, "cell 1 3");
		
		textPane = new JTextPane();
		contentPane.add(textPane, "cell 2 3 2 4,grow");
		
		rdbRojo = new JRadioButton("Rojo");
		rdbRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar(Color.RED);
			}
		});
		grupoColores.add(rdbRojo);
		contentPane.add(rdbRojo, "cell 1 4");
		
		 rdbVerde = new JRadioButton("Verde");
		rdbVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar(Color.GREEN);
			}
		});
		grupoColores.add(rdbVerde);
		contentPane.add(rdbVerde, "cell 1 5");
		
		 rdbMagenta = new JRadioButton("Magenta");
		rdbMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar (Color.MAGENTA);
			}
		});
		grupoColores.add(rdbMagenta);
		contentPane.add(rdbMagenta, "cell 1 6");
	}

		public void mostrar(Color color) {
			textPane.setBackground(color);
			//if (rdbRojo.isSelected()) {
			//textPane.setBackground(Color.RED);
			}
	
	
}
