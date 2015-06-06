package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class VistaJuegos extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public VistaJuegos() {
		setLayout(null);
		
		JLabel lblFiltros = new JLabel("Filtros");
		lblFiltros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFiltros.setBounds(22, 28, 46, 14);
		add(lblFiltros);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
		panel.setBounds(22, 53, 405, 64);
		add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(10, 7, 44, 14);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(label);
		
		JLabel label_1 = new JLabel("G\u00E9nero");
		label_1.setBounds(139, 7, 41, 14);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Plataforma");
		label_2.setBounds(286, 7, 63, 14);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(139, 32, 109, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(286, 32, 109, 20);
		panel.add(comboBox_1);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(235, 135, 46, 14);
		add(lblNombre);
		
		JLabel lblGnero = new JLabel("G\u00E9nero");
		lblGnero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGnero.setBounds(235, 191, 46, 20);
		add(lblGnero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPlataforma.setBounds(235, 248, 77, 14);
		add(lblPlataforma);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(235, 160, 192, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(235, 217, 192, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(235, 273, 192, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(235, 317, 192, 23);
		add(btnEditar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(235, 351, 192, 23);
		add(btnSalir);

	}
}
