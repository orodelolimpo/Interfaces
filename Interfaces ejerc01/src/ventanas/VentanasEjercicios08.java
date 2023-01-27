package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanasEjercicios08 extends JFrame {

	private JPanel contentPane;
	private JTextField textTituloPelicula;
	private JLabel lblPeliculas;
	private JComboBox comboBox;
	private JButton btnAñadir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicios08 frame = new VentanasEjercicios08();
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
	public VentanasEjercicios08() {
		setTitle("Películas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][14.00][][][][][grow]", "[][][][][][]"));
		
		JLabel lblEscribeTitulo = new JLabel("Escribe el título de una película");
		contentPane.add(lblEscribeTitulo, "cell 1 1 3 1");
		
		lblPeliculas = new JLabel("Películas");
		contentPane.add(lblPeliculas, "cell 7 1,alignx center");
		
		textTituloPelicula = new JTextField();
		contentPane.add(textTituloPelicula, "cell 2 3 2 1,growx");
		textTituloPelicula.setColumns(10);
	
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anade();
			}
		});
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Quantum of Solace", "Avatar", "Lo que el viento se llevó"}));
		contentPane.add(comboBox, "cell 7 3,growx");
		contentPane.add(btnAñadir, "cell 3 5");
	}
	
	protected void anade() {
		String pelicula=(String) textTituloPelicula.getText();
		
		comboBox.addItem(pelicula);
		
	//	comboBox.getModel().getElementAt(ABORT)
		
		
		
	}

}
