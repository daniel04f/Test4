package pl.kurs.test4.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Szafa implements Iterable<Ubranie> {
    private List<Ubranie> ubrania;

    public Szafa() {
        this.ubrania = new ArrayList<>();
    }

    public void dodajUbranie(Ubranie... ubrania) {
        Collections.addAll(this.ubrania, ubrania);
    }

    public List<Ubranie> getUbrania() {
        return new ArrayList<>(ubrania);
    }

    @Override
    public Iterator<Ubranie> iterator() {
        return ubrania.iterator();
    }
}
