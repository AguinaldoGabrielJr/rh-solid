package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeridiocidadeReajuste implements ValidacaoReajuste{

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();

		long mesmesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

		if (mesmesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("O periodo do ultimo reajuste não pode ser menor que 6 meses!");
		}
	}
}
