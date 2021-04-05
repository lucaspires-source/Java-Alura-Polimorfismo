public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente lucas = new Gerente();
        lucas.setNome("Lucas Riberio");
        lucas.setCpf("045797361-76");
        lucas.setSalario(10000.00);
        lucas.setSenha(123);
        System.out.println(lucas.getNome());
        System.out.println(lucas.getSalario());
        System.out.println(lucas.getCpf());
        System.out.println(lucas.getSenha());

        boolean autenticou = lucas.autentica(123);

        System.out.println(autenticou);

    }
}
