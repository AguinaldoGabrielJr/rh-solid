package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioData {
	public String nome;
	public String cpf;
	public Cargo cargo;
	public BigDecimal salario;
	public LocalDate dataUltimoReajuste;

	public FuncionarioData() {
	}
}