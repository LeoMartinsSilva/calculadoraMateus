package libs;

public enum EnOperacoesMatematicas {
	APLICAR_DESCONTO_VALOR(1, "Aplicar desconto % em valor", "Valor Inicial R$[a]", "% desconto [b]", "Resultado"),
	INCREMENTAR_PERCENTUAL_EM_VALOR(2, "Incrementar % em valor", "Valor Inicial R$[a]", "% acréscimo [b]", "Resultado"),
	PERCENTUAL_DE_VALOR(3, "Amostragem - quanto A% representa em B", "Total[a]", "Porcentagem[b]","Conrresponde a"),
	PEGAR_QUANTO_A_REPRESENTA_EM_B(4, "Amostragem 2 - quanto A representa em B", "Total [a]", "Parte [b]", "Corresponde a %"),
	PEGAR_DESCONTO_APLICADO(5, "Valor era A, paguei B, qual foi o desconto?", "Valor original[a]", "Valor c/ desconto [b]", "% desconto"),
	DIFERENCA_PERCENTUAL_DE_VALORES(6, "variação delta [%] - diferença % entre valores", "Valor inicial [a]", "Valor final [b]", "Diferença %"),
	VALOR_INICIAL(7, "Qual era o valor inicial", "Valor final [a]", "% desconto [b]", "Valor inicial"),
	REGRA_DE_TRES(8, "Regra de três", "", "", "");
	
	private int operacao;
	private String descricao;
	private String textLabel1;
	private String textLabel2;
	private String textResultado;
	
	private EnOperacoesMatematicas(int operacao, String descricao, String textLabel1, String textLabel2,
			String textResultado) {
		this.operacao = operacao;
		this.descricao = descricao;
		this.textLabel1 = textLabel1;
		this.textLabel2 = textLabel2;
		this.textResultado = textResultado;
	}

	public int getOperacao() {
		return operacao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getTextLabel1() {
		return textLabel1;
	}
	
	public String getTextLabel2() {
		return textLabel2;
	}
	public String getTextResultado() {
		return textResultado;
	}
}
