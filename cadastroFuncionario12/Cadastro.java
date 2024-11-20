package Funcionario;
public class Cadastro {
    private Funcionario[] funcionarios;
    private int contador;
    public Cadastro(int tamanho) {
        funcionarios = new Funcionario[tamanho];
        contador = 0;
    }
    public void cadastrarFuncionario(Funcionario funcionario) {
        if (contador < funcionarios.length) {
            funcionarios[contador] = funcionario;
            contador++;
        } else {
            System.out.println("Erro: Cadastro de funcionários está cheio.");
        }
    }
    public void exibeCadastro() {
        if (contador == 0) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (int i = 0; i < contador; i++) {
                funcionarios[i].exibe();
            }
        }
    }
}