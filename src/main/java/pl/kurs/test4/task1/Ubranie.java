package pl.kurs.test4.task1;

public class Ubranie {
    private String nazwa;
    private Rozmiar rozmiar;
    private double cena;
    private static Kryterium kryteriumSortowania = Kryterium.ROZMIAR;

    public enum Rozmiar {
        XS,
        S,
        M,
        L,
        XL,
        XXL
    }

    public enum Kryterium {
        ROZMIAR,
        WARTOSC
    }

    public Ubranie(String nazwa, Rozmiar rozmiar, double cena) {
        this.nazwa = nazwa;
        this.rozmiar = rozmiar;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Rozmiar getRozmiar() {
        return rozmiar;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Ubranie{" +
                "nazwa='" + nazwa + '\'' +
                ", rozmiar=" + rozmiar +
                ", cena=" + cena +
                '}';
    }
}
