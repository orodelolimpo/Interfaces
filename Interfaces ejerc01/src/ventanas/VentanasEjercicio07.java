package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class VentanasEjercicio07 extends JFrame {

	private JPanel contentPane;
	private JButton btnAceptar;
	private JComboBox comboBox;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicio07 frame = new VentanasEjercicio07();
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
	public VentanasEjercicio07() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][32.00][grow]", "[][][][][][][][][]"));
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblCiudad, "cell 0 1,alignx trailing");
		
		 comboBox = new JComboBox();
//		 comboBox.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					selecciona();
//					
//				}
//			});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "Cabra", "Córdoba", "Lucena", "Montalbán", "Montilla", "Monturque", "Puente Genil"}));
		contentPane.add(comboBox, "cell 3 1 2 1,growx");
		
		 btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecciona();
			}
		});
		
		JLabel lblHasSeleccionado = new JLabel("Has seleccionado:");
		contentPane.add(lblHasSeleccionado, "cell 0 5");
		
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel, "flowx,cell 3 5");
		contentPane.add(btnAceptar, "cell 4 8");
		
		JLabel lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 3 5");
	}
	protected void selecciona() {
		String municipio=(String) comboBox.getSelectedItem();
		
		lblNewLabel.setText(municipio);
	
	}

}
