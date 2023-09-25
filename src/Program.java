import java.math.BigDecimal;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.ReajusteSalarioService;

public class Program {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Guina");
		funcionario.setCpf("008.403.709-11");
		funcionario.setCargo(Cargo.ASSISTENTE);
		BigDecimal bigDecimal = new BigDecimal(100);
		funcionario.setSalario(bigDecimal);
		
		BigDecimal bigDecimal2 = new BigDecimal("100");
		
		new Funcionario("Racquel", "00840370911", Cargo.ESPECIALISTA, bigDecimal2);
		
		ReajusteSalarioService reajusteSalarioService = new ReajusteSalarioService();
		reajusteSalarioService.reajustarSalarioFuncionario(funcionario, bigDecimal);
		
		
	}
}
