package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanasEjercicio03bis extends JFrame {

	private JPanel contentPane;
	private JTextField textResultadoNombre;
	private JTextField textResultadoNota1;
	private JTextField textResultadoNota2;
	private JTextField textResultadoNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicio03bis frame = new VentanasEjercicio03bis();
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
	public VentanasEjercicio03bis() {
		setTitle("CALCULO DE PROMEDIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[78.00][grow][62.00][94.00,grow][51.00][99.00,grow]", "[][][][][][][][][]"));
		
		JLabel lblTitulo = new JLabel("CALCULAR PROMEDIO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setOpaque(true);
		lblTitulo.setBackground(new Color(0, 0, 0));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblTitulo, "cell 0 0 6 1,grow");
		
		JLabel lblNombre = new JLabel("Nombre:");
		contentPane.add(lblNombre, "cell 0 2,alignx left");
		
		textResultadoNombre = new JTextField();
		contentPane.add(textResultadoNombre, "cell 1 2 5 1,growx");
		textResultadoNombre.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota 1:");
		contentPane.add(lblNota, "cell 0 3,alignx left");
		
		textResultadoNota1 = new JTextField();
		contentPane.add(textResultadoNota1, "cell 1 3,growx");
		textResultadoNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		contentPane.add(lblNota2, "cell 2 3,alignx trailing");
		
		textResultadoNota2 = new JTextField();
		contentPane.add(textResultadoNota2, "cell 3 3,growx");
		textResultadoNota2.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		contentPane.add(lblNota3, "cell 4 3,alignx trailing");
		
		textResultadoNota3 = new JTextField();
		contentPane.add(textResultadoNota3, "cell 5 3,growx");
		textResultadoNota3.setColumns(10);
				
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblPromedio, "cell 0 7,alignx center");
		
		JLabel lblResultadoPromedio = new JLabel("");
		lblResultadoPromedio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblResultadoPromedio, "cell 1 7");
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblResultado, "cell 0 8,alignx center");
		
		JLabel lblResultadodelResultado = new JLabel("");
		contentPane.add(lblResultadodelResultado, "cell 1 8");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					double nota1=Double.parseDouble(textResultadoNota1.getText());
					double nota2=Double.parseDouble(textResultadoNota2.getText());
					double nota3=Double.parseDouble(textResultadoNota3.getText());
					double suma=nota1+nota2+nota3;
									
					lblResultadoPromedio.setText(String.format("%.2f", suma/3));
					
					if (suma/3 >=5) {
						lblResultadodelResultado.setForeground(Color.black);
						lblResultadodelResultado.setText("Ha aprobado");
						
					}else {
						lblResultadodelResultado.setText("Toca recuperar");
						lblResultadodelResultado.setForeground(Color.red);
					}
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Introduzca las notas correctamente", "Nota erronea", 					JOptionPane.WARNING_MESSAGE);
				}
			
				
			}
		});
		contentPane.add(btnCalcular, "cell 4 5 2 1,growx");
	}

}
