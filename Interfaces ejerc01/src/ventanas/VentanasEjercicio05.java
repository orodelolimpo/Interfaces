package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class VentanasEjercicio05 extends JFrame {

	private JPanel contentPane;
	private AbstractButton chDeportes;
	private JTextArea textArea;
	private JCheckBox chTecnologia;
	private JCheckBox chJuegos;
	private JCheckBox chCocina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicio05 frame = new VentanasEjercicio05();
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
	public VentanasEjercicio05() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][73.00][20.00][20px,grow][grow][grow][][][]", "[][56.00][35.00,grow][35.00][35.00][29.00][grow][][]"));
		
		JLabel lblHobbies = new JLabel("Hobbies:");
		contentPane.add(lblHobbies, "cell 0 1");
		
		JLabel lblHasSeleccionado = new JLabel("Has seleccionado:");
		contentPane.add(lblHasSeleccionado, "cell 3 1 2 1");
		
		chDeportes = new JCheckBox("Deportes");
		contentPane.add(chDeportes, "cell 1 2");
		
		textArea = new JTextArea();
		contentPane.add(textArea, "cell 3 2 5 5,grow");
		
		chTecnologia = new JCheckBox("Tecnología");
		contentPane.add(chTecnologia, "cell 1 3");
		
		chJuegos = new JCheckBox("Juegos");
		contentPane.add(chJuegos, "cell 1 4");
		
		chCocina = new JCheckBox("Cocina");
		contentPane.add(chCocina, "cell 1 5");
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprueba();
			}
		});
		contentPane.add(btnComprobar, "cell 3 8,alignx center");
		
		
	}

	protected void comprueba() {
		
		textArea.setText("");
		
		if (chDeportes.isSelected()) {
			textArea.setText ("Deportes"+"\n");
		}	
		if (chTecnologia.isSelected()) {
			textArea.setText(textArea.getText()+"Tecnología"+"\n");
		}	
		if (chJuegos.isSelected()) {
			textArea.setText(textArea.getText ()+ "Juegos"+"\n");
		}	
		if (chCocina.isSelected()) {
			textArea.setText(textArea.getText() +"Cocina");
		}	
		
	}
}
