package model.entity;

public class Discipline {
    private String name, workload, teacher;

    public Discipline(String name, String workload, String teacher) {
        super();
        this.name = name;
        this.workload = workload;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
