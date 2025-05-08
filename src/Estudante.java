public class Estudante {
    private String matricula, email, nome, endereco, cpf;

    public Estudante(String matricula, String nome, String email, String endereco, String cpf){
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getEmail(){
        return email;
    }
    public String getMatricula(){
        return matricula;
    }

    public void info(){
        System.out.printf("   Aluno: %s\n       Matrícula: %s\n       Endereço: %s\n       Email: %s\n       CPF: %s\n\n",getNome(), getMatricula(), getEndereco(), getEmail(), getCpf());
    }
}