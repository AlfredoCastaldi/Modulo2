public class Gatto extends Animale{

    @Override
    public void faiIlVerso() {
        super.verso = "miao";
        super.faiIlVerso();
    }
}
