public class Main {
    public static void main (String[] args){
        Studente studente1 = new Studente("mario","rossi");
        String nome = studente1.getName();
        String surname = studente1.getSurname();
        int id = studente1.getId();

        System.out.println(nome + " " + surname + " " + id);
    }
}
