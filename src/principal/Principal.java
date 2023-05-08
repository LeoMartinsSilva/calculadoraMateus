package principal;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import libs.EnOperacoesMatematicas;
import libs.Quadrado;
import libs.RegraDeTres;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel1;

	public Principal(){
		setSize(1150,625);
		setLayout(null);
		componentesCriar();
		setVisible(true);
	}
	
	private void componentesCriar() {
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(10, 10, 200, 200);
		panel1.setBorder(BorderFactory.createTitledBorder("Aplicar desconto % num valor"));
		
		Quadrado quadrado1 = new Quadrado(10, 10, EnOperacoesMatematicas.APLICAR_DESCONTO_VALOR);
		
		Quadrado quadrado2 = new Quadrado(290,10, EnOperacoesMatematicas.INCREMENTAR_PERCENTUAL_EM_VALOR);
		
		Quadrado quadrado3 = new Quadrado(570, 10, EnOperacoesMatematicas.PERCENTUAL_DE_VALOR);
		
		Quadrado quadrado4 = new Quadrado(850, 10, EnOperacoesMatematicas.PEGAR_QUANTO_A_REPRESENTA_EM_B);
		
		Quadrado quadrado5 = new Quadrado(10, 170, EnOperacoesMatematicas.PEGAR_DESCONTO_APLICADO);
		
		Quadrado quadrado6 = new Quadrado(290, 170, EnOperacoesMatematicas.DIFERENCA_PERCENTUAL_DE_VALORES);
		
		Quadrado quadrado7 = new Quadrado(570, 170, EnOperacoesMatematicas.VALOR_INICIAL);
		
		RegraDeTres regraDeTres = new RegraDeTres(10, 330, EnOperacoesMatematicas.REGRA_DE_TRES);
		
		getContentPane().add(quadrado1);
		getContentPane().add(quadrado2);
		getContentPane().add(quadrado3);
		getContentPane().add(quadrado4);
		getContentPane().add(quadrado5);
		getContentPane().add(quadrado6);
		getContentPane().add(quadrado7);
		getContentPane().add(regraDeTres);
	}
	
	public static void main(String[] args) {
		
		new Principal();
		
	}
}
