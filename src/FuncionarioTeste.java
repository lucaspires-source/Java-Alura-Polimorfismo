
public class FuncionarioTeste {
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0;
    // 0-Funcionário Padrão
    // 1-Gerente
    // 2-Diretor

    public double getBonificacao() {

        if (this.tipo == 0) {
            return this.salario * 0.1; // 0-Funcionário Padrão
        } else if (this.tipo == 1) {
            return this.salario; // 1-Gerente
        } else {
            return 2 * this.salario; // 2-Diretor
        }
    }

    public int getTipo() {
        return tipo;
    }

    public int setTipo(int tipo) {
        return this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
