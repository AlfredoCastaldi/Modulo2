public class Studente {
    private String name;
    private String surname;
    private int id;

    public Studente(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
