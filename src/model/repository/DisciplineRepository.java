package model.repository;

import java.util.ArrayList;
import java.util.List;

import model.entity.Discipline;

public class DisciplineRepository {
    private List<Discipline> disciplines = new ArrayList<>();

    public void add(String name, String workload, String teacher) {
        disciplines.add(new Discipline(name, workload, teacher));
    }

    public void remove(Discipline discipline) {
        disciplines.remove(discipline);
    }
}
