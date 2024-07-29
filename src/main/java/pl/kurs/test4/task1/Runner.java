package pl.kurs.test4.task1;

import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        Ubranie u1 = new Ubranie("Koszula", Ubranie.Rozmiar.L, 299.0);
        Ubranie u2 = new Ubranie("Jeansy", Ubranie.Rozmiar.S, 120.0);
        Ubranie u3 = new Ubranie("Majtki", Ubranie.Rozmiar.XL, 55.0);
        Ubranie u4 = new Ubranie("Koszula", Ubranie.Rozmiar.M, 481.0);

        Szafa szafa = new Szafa();
        szafa.dodajUbranie();
        szafa.dodajUbranie(u1, u2);
        szafa.dodajUbranie(u1, u2, u3, u4);

        System.out.println("\nWszystkie ubrania w szafie: ");
        for (Ubranie u : szafa) {
            System.out.println(u.getNazwa() + " - " + u.getRozmiar() + " - " + u.getCena());
        }

        System.out.println("\nNajwiększe ubranie w szafie: ");
        Ubranie najwieksze = Collections.max(szafa.getUbrania()); // ma zwrocic najwieksze ubranie
        System.out.println(najwieksze);

        Ubranie.ustalKryteriumSortowania(Ubranie.Kryterium.WARTOSC);

        System.out.println("\nNajdroższe ubranie w szafie: ");
        Ubranie najdrozsze = Collections.max(szafa.getUbrania()); // teraz po zmianie kryterium sotowania ma zwrocic najdrozsze ubranie
        System.out.println(najdrozsze);
    }
}
