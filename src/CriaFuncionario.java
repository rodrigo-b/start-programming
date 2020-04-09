public class CriaFuncionario {

    public static void main(String [] args){

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Claudomiro";
        funcionario1.salario = 2500;
        funcionario1.cpf = "552.2345.567-86";
        funcionario1.cargo = "Analista";

        double salarioDuplicado  = funcionario1.multiplicaSalarioPorDois();

        System.out.println("O valor do salario duplicado é " + salarioDuplicado);


        if(funcionario1.cargo == "Gerente"){
            funcionario1.comissao = funcionario1.salario * 0.30;
        }


        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Claudomiro";
        funcionario2.cargo = "gerente";
        funcionario2.salario = 5000;

        double salarioDuplicadoDoFuncionarioDois = funcionario2.multiplicaSalarioPorDois();

        System.out.println("O valor do salario duplicado é " + salarioDuplicadoDoFuncionarioDois);

        Funcionario funcionario3 = funcionario1;
        funcionario3.nome = "Hugo";

        System.out.println("O nome do funcionario 1 é: " + funcionario1.nome);
        System.out.println("O nome do funcionario 2 é: " + funcionario2.nome);
        System.out.println("O nome do funcionario 3 é: " + funcionario3.nome);

        if(funcionario1.nome == funcionario2.nome){
            System.out.println("Os dois Funcionarios são iguais");
        }else{
            System.out.println("Os dois funcionarios são diferentes");
        }

        System.out.println(funcionario1);
        System.out.println(funcionario2);
    }

}
