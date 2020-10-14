package regras;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;

public class ControleBotoes {
	
	private String nmBotao;
	private Map<JButton, Boolean> referenciaBotoes;
	
	public ControleBotoes() {
		this.referenciaBotoes = new HashMap<>();
	}
	
	public String getNmBotao() {
		return nmBotao;
	}
	public void setNmBotao(String nmBotao) {
		this.nmBotao = nmBotao;
	}
	public Map<JButton, Boolean> getReferenciaBotoes() {
		return referenciaBotoes;
	}
	public void setReferenciaBotoes(Map<JButton, Boolean> referenciaBotoes) {
		this.referenciaBotoes = referenciaBotoes;
	}

	public void adicionarBotao (JButton botao) {
		this.referenciaBotoes.put(botao, Boolean.FALSE);
	}
	
	public void alterarSelecao(JButton botao, Boolean selecionado) {
		Boolean b = this.referenciaBotoes.get(botao);
		b=selecionado;
	}
	
	public void zerarSelecoes() {
		for (Boolean b : this.referenciaBotoes.values()) {
			b=false;
		}
	}
	
	public Boolean isTodosSelecionados() {
		for (Boolean b : this.referenciaBotoes.values()) {
			if (!b) {
				return false;
			}
		}
		return true;
		
	}
}



