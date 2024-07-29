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
}
