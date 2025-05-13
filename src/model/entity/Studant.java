package model.entity;

public class Studant {
    private String name, address, email, cpf;
    private int age;

    public Studant(String name, String address, String email, String cpf, int age) {
        super();
        this.name = name;
        this.address = address;
        this.email = email;
        this.cpf = cpf;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
