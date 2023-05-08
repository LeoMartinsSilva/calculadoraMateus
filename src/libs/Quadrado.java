package libs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Quadrado extends JPanel{
	private JPanel panel;
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	
	private JButton btnCalcular;
	
	public Quadrado(int x, int y, EnOperacoesMatematicas operacao) {
		setLayout(null);
		componentesCriar(x, y, operacao);
		setVisible(true);
		
	}
	
	public void componentesCriar(int x, int y, EnOperacoesMatematicas operacao) {
		
		this.setBounds(x, y, 270, 150);
		this.setBorder(BorderFactory.createTitledBorder(operacao.getDescricao()));
		
		label1 = new JLabel();
		label1.setBounds(0, 25, 125, 25);
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		label1.setText(operacao.getTextLabel1());
		label1.setForeground(Color.red);
		
		textField1 = new JTextField();
		textField1.setBounds(130, 25, 125, 25);
		textField1.setBackground(Color.decode("#fff0f0"));
		
		label2 = new JLabel();
		label2.setBounds(0, 50, 125, 25);
		label2.setHorizontalAlignment(SwingConstants.RIGHT);
		label2.setText(operacao.getTextLabel2());
		label2.setForeground(Color.blue);
		
		textField2 = new JTextField();
		textField2.setBounds(130, 50, 125, 25);
		textField2.setBackground(Color.decode("#eafcff"));
		
		label3 = new JLabel();
		label3.setBounds(0, 75, 125, 25);
		label3.setHorizontalAlignment(SwingConstants.RIGHT);
		label3.setText(operacao.getTextResultado());
		label3.setForeground(Color.black);
		
		textField3 = new JTextField();
		textField3.setBounds(130, 75, 125, 25);
		textField3.setBackground(Color.decode("#f0f0f0"));
		textField3.setEditable(false);
		
		btnCalcular = new JButton();
		btnCalcular.setBounds(10, 115, 250, 25);
		btnCalcular.setBackground(Color.decode("#cbccd4"));
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double resultado = OperacoesMatematicas.calcularWrapper(operacao.getOperacao(), Double.parseDouble(textField1.getText()), Double.parseDouble(textField2.getText()), 0.0);
					textField3.setText(String.valueOf(resultado));
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Erro ao converter valores");
				}
				
			}
		});
		
		this.add(label1);
		this.add(textField1);
		this.add(label2);
		this.add(textField2);
		this.add(label3);
		this.add(textField3);
		this.add(btnCalcular);
		
	}
}
