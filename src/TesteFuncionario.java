public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario lucas = new Funcionario();
        lucas.setNome("Lucas Riberio");
        lucas.setCpf("045797361-76");
        lucas.setSalario(4000.00);

        System.out.println(lucas.getNome());
        System.out.println(lucas.getSalario());
        System.out.println(lucas.getCpf());
        System.out.println(lucas.getBonificacao());
    }
}
