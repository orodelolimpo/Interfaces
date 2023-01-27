package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ButtonGroup;

public class VentanasEjercicios09 extends JFrame {

	private JPanel contentPane;
	private JTextField textCantidadCalcular;
	private JRadioButton rdbDolares;
	private JRadioButton rdbEuros;
	private JRadioButton rdbYenes;
	private JRadioButton rdbDolares2;
	private JRadioButton rdbEuros2;
	private JRadioButton rdbYenes2;
	private JLabel lblResultado;
	private final ButtonGroup Botones1 = new ButtonGroup();
	private final ButtonGroup Botones2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicios09 frame = new VentanasEjercicios09();
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
	public VentanasEjercicios09() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[82.00][396.00,grow][][][73.00,grow][][][396.00][396.00][396.00]", "[][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Conversión de monedas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel, "cell 0 1 10 1,alignx center");
		
		JLabel lblTutuloDe = new JLabel("De:");
		contentPane.add(lblTutuloDe, "cell 1 3,alignx right");
		
		rdbDolares = new JRadioButton("Dólares");
		Botones1.add(rdbDolares);
		rdbDolares.setSelected(true);
		contentPane.add(rdbDolares, "cell 4 3");
		
		rdbEuros = new JRadioButton("Euros");
		Botones1.add(rdbEuros);
		contentPane.add(rdbEuros, "cell 7 3");
		
		rdbYenes = new JRadioButton("Yenes");
		Botones1.add(rdbYenes);
		contentPane.add(rdbYenes, "cell 8 3");
		
		JLabel lblTituloCantidad = new JLabel("Cantidad:");
		lblTituloCantidad.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lblTituloCantidad, "cell 1 4,alignx right");
		
		textCantidadCalcular = new JTextField();
		contentPane.add(textCantidadCalcular, "cell 4 4 6 1,growx");
		textCantidadCalcular.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setPreferredSize(new Dimension(80, 21));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertir();
			}
		});
		contentPane.add(btnCalcular, "cell 5 6 3 1");
		
		JLabel lblTituloA = new JLabel("A:");
		lblTituloA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(lblTituloA, "cell 1 8,alignx right");
		
		rdbDolares2 = new JRadioButton("Dólares");
		Botones2.add(rdbDolares2);
		contentPane.add(rdbDolares2, "cell 4 8");
		
		rdbEuros2 = new JRadioButton("Euros");
		Botones2.add(rdbEuros2);
		rdbEuros2.setSelected(true);
		contentPane.add(rdbEuros2, "cell 7 8");
		
		rdbYenes2 = new JRadioButton("Yenes");
		Botones2.add(rdbYenes2);
		contentPane.add(rdbYenes2, "cell 8 8");
		
		JLabel lblTituloResultado = new JLabel("Resultado:");
		contentPane.add(lblTituloResultado, "cell 2 10 3 1");
		
		lblResultado = new JLabel("");
		lblResultado.setMaximumSize(new Dimension(60, 18));
		contentPane.add(lblResultado, "cell 7 10 2 1");
	}

	protected void convertir() {
		
		double calculo=0;
		double cantidad = Double.parseDouble(textCantidadCalcular.getText()) ;
		String moneda="$";
		
		if (rdbEuros.isSelected() && rdbEuros2.isSelected() ||
			rdbDolares.isSelected() && rdbDolares2.isSelected()	|| 
			rdbYenes.isSelected() && rdbYenes.isSelected()) {
			JOptionPane.showMessageDialog(null,"Seleccione otra moneda","ERROR 				SELECCIÓN",JOptionPane.ERROR_MESSAGE);
			return;
		}
	
		
		if (rdbEuros.isSelected()) {
			if (rdbDolares2.isSelected()) {
				calculo= cantidad*1.09;
			} else if (rdbYenes2.isSelected()) {
				calculo=cantidad*141.28;
				moneda="Y";
			}
		}
			
		if (rdbDolares.isSelected ()) {
			if (rdbEuros2.isSelected ()) {
				calculo= cantidad*0.92;	
				moneda="€";
			}else if (rdbYenes2.isSelected()) {
				 calculo=cantidad*129.82;
				 moneda="Y";
			}
		}
		
		if (rdbYenes.isSelected()) {
			if (rdbEuros2.isSelected ()) {
				calculo=cantidad*0.0071;
				moneda="€";
			}else if (rdbDolares2.isSelected()) {
				calculo=cantidad*0.0077;
				moneda="$";
			}
		}
		
		lblResultado.setText(calculo+ moneda);
		
		}
		
		
		
	protected void mostrar() {
		
	}
}
