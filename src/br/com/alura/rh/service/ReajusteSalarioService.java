package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteSalarioService {

	private List<ValidacaoReajuste> validacoes;

	public ReajusteSalarioService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));

		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);

	}
}
