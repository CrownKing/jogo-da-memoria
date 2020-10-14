package regras;

import javax.swing.JButton;

public class ReferenciasBotoes {
	private JButton botao;
	private Boolean selecionado;

	
	public JButton getBotao() {
		return botao;
	}
	
	public void setBotao(JButton botao) {
		this.botao = botao;
	}
	
	public Boolean getSelect() {
		return selecionado;
	}
	
	public void setSelect(Boolean selecionado) {
		this.selecionado = selecionado;
	}
}
