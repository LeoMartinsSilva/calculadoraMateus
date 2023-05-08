package libs;

public class OperacoesMatematicas {
	
	public static double calcularWrapper(int operacao, double a, double b, double r1){
		switch(operacao) {
			case 1:
				return aplicarDescontoValor(a,b);
			case 2:
				return incrementarPercentualEmValor(a,b);
			case 3:
				return getPercentualDeValor(a,b);	
			case 4:
				return pegarQuantoARepresentaEmB(a,b);
			case 5:
				return pegarDescontoAplicado(a,b);
			case 6:
				return getDiferencaPercentualDeValores(a,b);
			case 7:
				return getValorInicial(a,b);
			case 8:
				return regraDeTres(a,b,r1);
			default:
				return 0;
		}
	}

	public static double aplicarDescontoValor(double valor, double percentual) {
		double resultado = valor - (valor * (percentual/100));
		return resultado;
	}
	public static double incrementarPercentualEmValor(double valor, double percentual) {
		double resultado = valor + (valor * (percentual/100));
		return resultado;
	}
	public static double getPercentualDeValor(double total, double percentual) {
		double resultado = (total*percentual)/100;
		return resultado;
	}
	public static double pegarQuantoARepresentaEmB(double valorA, double valorB) {
		double resultado = (valorB * 100)/valorA;
		return resultado;
	}
	
	public static double pegarDescontoAplicado(double valorInicial, double valorFinal) {
		double resultado = ((valorInicial - valorFinal)/valorInicial)*100;
		return resultado;
	}
	
	public static double getDiferencaPercentualDeValores(double valorA, double valorB) {
		if(valorA > valorB) {
			return (valorA - valorB)/valorB;
		}else if(valorA<valorB) {
			return (valorB - valorA)/valorA;
		}
		return 0.0;
	}
	
	public static double getValorInicial(double valorFinal, double percentual) {
		double resultado = (valorFinal*100)/(100-percentual);
		return resultado;
	}
	
	public static double regraDeTres(double a, double b, double r1) {
		double r2 = r1*b/a;
		return r2;
	}
	
}
