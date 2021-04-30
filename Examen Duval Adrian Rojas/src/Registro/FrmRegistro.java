package Registro;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import util.Validaciones;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmRegistro extends JFrame implements ActionListener {

	private static final String TargetadeCredito = null;
	private static final String CuentaBancaria = null;
	private JPanel contentPane;
	private JTextField txtTarjetadeCredito;
	private JTextField txtCuentaBancaria;
	private JTextField txtPasaporte;
	private JTextField txtCorreoGmail;
	private JTextField txtFechaNacimiento;
	private JButton btnEnviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegistro frame = new FrmRegistro();
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
	public FrmRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFormularioDeRegistro = new JLabel("Formulario de Registro");
		lblFormularioDeRegistro.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 18));
		lblFormularioDeRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormularioDeRegistro.setBounds(10, 11, 414, 24);
		contentPane.add(lblFormularioDeRegistro);
		
		JLabel lblNewLabel = new JLabel("Tarjeta de credito ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(36, 46, 171, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cuenta Bancaria");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(36, 73, 156, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pasaporte");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(36, 104, 134, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo Gmail");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(36, 134, 134, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento");
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFechaNacimiento.setBounds(36, 169, 156, 24);
		contentPane.add(lblFechaNacimiento);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(this);
		btnEnviar.setBounds(179, 227, 89, 23);
		contentPane.add(btnEnviar);
		
		txtTarjetadeCredito = new JTextField();
		txtTarjetadeCredito.setBounds(246, 51, 145, 20);
		contentPane.add(txtTarjetadeCredito);
		txtTarjetadeCredito.setColumns(10);
		
		txtCuentaBancaria = new JTextField();
		txtCuentaBancaria.setBounds(246, 78, 145, 20);
		contentPane.add(txtCuentaBancaria);
		txtCuentaBancaria.setColumns(10);
		
		txtPasaporte = new JTextField();
		txtPasaporte.setBounds(246, 111, 145, 20);
		contentPane.add(txtPasaporte);
		txtPasaporte.setColumns(10);
		
		txtCorreoGmail = new JTextField();
		txtCorreoGmail.setBounds(246, 139, 145, 20);
		contentPane.add(txtCorreoGmail);
		txtCorreoGmail.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(246, 174, 145, 20);
		contentPane.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEnviar) {
			actionPerformedBtnEnviarJButton(arg0);
		}
	}
	protected void actionPerformedBtnEnviarJButton(ActionEvent arg0) {
		String tdc = txtTarjetadeCredito.getText();
		String cb = txtCuentaBancaria.getText();
		String pas = txtPasaporte.getText();
		String cor = txtCorreoGmail.getText();
		String fen = txtFechaNacimiento.getText();
		if(!tdc.matches(Validaciones.tar)) {
			mensaje("Para que su tarjeta sea valida ponga 16 digitos ");
		}else if(!cb.matches("[0][-][0][0][1][5][8][-][0-9][0-9][0-9][0-9][0-9][-][0-9][0-9][0-9]")) {
			mensaje("para que su cuenta bancaria sea valida tiene que tener 14 digitos");
	}else if(!pas.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][-][0-9][0-9]")) {
		mensaje("para que su pasaporte sea valida tiene que tener 14 digitos");
	}else if(!cor.matches(Validaciones.CORREO)) {
		mensaje("error al colocar el correo ");
}else if(!fen.matches(Validaciones.FECHA)) {
	mensaje("error al colocar fecha de Nacimiento ");
}else {
		mensaje("Registro exitoso");
	}
		
}
	
	public void mensaje(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}
}
