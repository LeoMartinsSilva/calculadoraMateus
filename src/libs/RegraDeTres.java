package libs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegraDeTres extends JPanel{
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	
	private JButton btnCalcular;
	
	public RegraDeTres(int x, int y, EnOperacoesMatematicas operacao) {
		setLayout(null);
		componentesCriar(x, y, operacao);
		setVisible(true);
	}
	
	private void componentesCriar(int x, int y, EnOperacoesMatematicas operacao) {
		
		this.setBounds(x, y, 340, 120);
		this.setBorder(BorderFactory.createTitledBorder(operacao.getDescricao()));
		
		label1 = new JLabel();
		label1.setBounds(0, 25, 20, 25);
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		label1.setText("a:");
		label1.setForeground(Color.red);
		
		textField1 = new JTextField();
		textField1.setBounds(25, 25, 125, 25);
		textField1.setBackground(Color.decode("#fff0f0"));
		
		label2 = new JLabel();
		label2.setBounds(160, 25, 20, 25);
		label2.setHorizontalAlignment(SwingConstants.RIGHT);
		label2.setText("r1:");
		label2.setForeground(Color.decode("#7cbc7c"));
		
		textField2 = new JTextField();
		textField2.setBounds(185, 25, 125, 25);
		textField2.setBackground(Color.decode("#ebffd7"));
		
		label3 = new JLabel();
		label3.setBounds(0, 50, 20, 25);
		label3.setHorizontalAlignment(SwingConstants.RIGHT);
		label3.setText("b:");
		label3.setForeground(Color.blue);
		
		textField3 = new JTextField();
		textField3.setBounds(25, 50, 125, 25);
		textField3.setBackground(Color.decode("#eafcff"));
		
		label4 = new JLabel();
		label4.setBounds(160, 50, 20, 25);
		label4.setHorizontalAlignment(SwingConstants.RIGHT);
		label4.setText("r2:");
		label4.setForeground(Color.black);
		
		textField4 = new JTextField();
		textField4.setBounds(185, 50, 125, 25);
		textField4.setBackground(Color.decode("#f0f0f0"));
		textField4.setEditable(false);
	
		btnCalcular = new JButton();
		btnCalcular.setBounds(10, 85, 320, 25);
		btnCalcular.setBackground(Color.decode("#cbccd4"));
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double resultado = OperacoesMatematicas.calcularWrapper(operacao.getOperacao(), Double.parseDouble(textField1.getText()), Double.parseDouble(textField3.getText()), Double.parseDouble(textField2.getText()));
					textField4.setText(String.valueOf(resultado));
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
		this.add(label4);
		this.add(textField4);
		this.add(btnCalcular);
		
	}
	
	
	
}
