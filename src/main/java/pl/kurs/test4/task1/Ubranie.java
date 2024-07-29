package pl.kurs.test4.task1;

import java.util.Comparator;

public class Ubranie implements Comparable<Ubranie> {
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

    public static void ustalKryteriumSortowania(Kryterium kryterium) {
        kryteriumSortowania = kryterium;
    }

    @Override
    public int compareTo(Ubranie o) {
        return getComparator().compare(this, o);
    }

    public static Comparator<Ubranie> getComparator() {
        return switch (kryteriumSortowania) {
            case WARTOSC -> Comparator.comparingDouble(Ubranie::getCena);
            case ROZMIAR -> Comparator.comparing(Ubranie::getRozmiar);
        };
    }
}
