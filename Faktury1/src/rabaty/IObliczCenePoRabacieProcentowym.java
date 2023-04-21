package rabaty;

public class IObliczCenePoRabacieProcentowym implements IObliczCenePoRabacie {

    private final double procentRabatu;

    public IObliczCenePoRabacieProcentowym(double procentRabatu) {
        this.procentRabatu = procentRabatu;
    }

    @Override
    public double obliczCenePoRabacie(double cena) {

        return cena * procentRabatu / 100;
    }
}
