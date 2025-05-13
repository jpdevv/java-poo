package model.repository;

import java.util.ArrayList;
import java.util.List;

import model.entity.Discipline;

public class DisciplineRepository {
    private List<Discipline> disciplines = new ArrayList<>();

    public void add(Discipline discipline) {
        disciplines.add(discipline);
    }

    public void remove(int index) {
        disciplines.remove(index);
    }
}
