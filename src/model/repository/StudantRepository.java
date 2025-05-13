package model.repository;

import java.util.ArrayList;
import java.util.List;

import model.entity.Studant;

public class StudantRepository {
    private List<Studant> studants = new ArrayList<>();

    public void add(Studant studant) {
        studants.add(studant);
    }

    public void remove(int index) {
        studants.remove(index);
    }
}
