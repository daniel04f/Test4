package pl.kurs.test4.task1;

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
    }
}
