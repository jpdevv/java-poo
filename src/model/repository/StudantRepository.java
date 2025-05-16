package model.repository;

import java.util.ArrayList;
import java.util.List;

import model.entity.Studant;

public class StudantRepository {
    private List<Studant> studants = new ArrayList<>();

    public void add(String name, String address, String email, String cpf, int age) {
        studants.add(new Studant(name, address, email, cpf, age));
    }

    public void remove(Studant studant) {
        studants.remove(studant);
    }
}
