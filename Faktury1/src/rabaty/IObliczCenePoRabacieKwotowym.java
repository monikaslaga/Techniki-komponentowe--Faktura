package rabaty;

public class IObliczCenePoRabacieKwotowym implements IObliczCenePoRabacie {

    private final double kwotaRabatu;

    public IObliczCenePoRabacieKwotowym(double kwotaRabatu) {
        this.kwotaRabatu = kwotaRabatu;
    }

    @Override
    public double obliczCenePoRabacie(double cena) {

        return cena - kwotaRabatu;
    }
}
