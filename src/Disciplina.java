import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cod, cargaHoraria;
    private List<Estudante> estudantes = new ArrayList<>();

    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cod = new Random().nextInt(100);
        this.cargaHoraria = cargaHoraria;
    }

    public void cadastrarEstudante(Estudante aluno){
        estudantes.add(aluno);
    }

    public void removerEstudante(Estudante estudante) {
        estudantes.remove(estudante);
    }

    public void listarEstudantes() {
        for (Estudante estudante : estudantes) {
            estudante.info();
        }
    }



    // Getters
    public String getNome(){
        return nome;
    }

    public int getCod() {
        return cod;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}