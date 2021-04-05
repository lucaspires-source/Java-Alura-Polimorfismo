public class TesteFuncionarioTeste {
    public static void main(String[] args) {

        FuncionarioTeste lucas = new FuncionarioTeste();
        lucas.setNome("Lucas Pires");
        lucas.setCpf("045797361-76");
        lucas.setSalario(10000.00);
        lucas.setTipo(2);

        System.out.println(lucas.getNome());
        System.out.println(lucas.getSalario());
        System.out.println(lucas.getCpf());
        System.out.println(lucas.getBonificacao());
    }
}
