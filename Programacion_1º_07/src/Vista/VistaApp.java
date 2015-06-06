package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import Controlador.MainController;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

public class VistaApp extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	private VistaPrincipal vPrincipal;
	private VistaJuegos vJuegos;

	/**
	 * Create the frame.
	 */
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		setContentPane(contentPane);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showPrincipal1();

			}
		});
		mnPrincipal.add(mntmPrincipal);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		mntmJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showJuegos();

			}
		});
		mnJuegos.add(mntmJuegos);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
	
		JMenu mnSubPrincipal = new JMenu("Perfil");
		mnPerfil.add(mnSubPrincipal);
		
     	panel = new JPanel();
     	contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		
		//Añadimos las diferentes ventanas
		vPrincipal = new VistaPrincipal();
				panel.add(vPrincipal,"Inicial");
				vJuegos = new VistaJuegos();
				panel.add(vJuegos,"Juegos");

		

	}
	
	public void showPrincipal(ArrayList<String> usuarios){
		this.vPrincipal.putUsuarios(usuarios);
	}
	public void showPrincipal(){
		CardLayout c= (CardLayout) this.panel.getLayout();
		c.show(panel, "Inicial");
	}
	public void showJuegos(){
		CardLayout c= (CardLayout) this.panel.getLayout();
		c.show(panel, "Juegos");
	}
}
