package com.kodilla.patterns2.decorator.taxiportal;
//Interfejs może zawierać jedynie deklaracje metod, a klasa abstrakcyjna może zawierać
// również metody zdefiniowane. Wynika to bezpośrednio z tego, że interfejs skupia się na
// zapewnieniu określonej funkcjonalności, natomiast klasa
// abstrakcyjna może również opierać się na podobieństwie w implementacji klas pochodnych.

//Klasy abstrakcyjne
//mogą posiadać metody abstrakcyjne, ale też i zwykłe (nieabstrakcyjne),
//nie mogą posiadać metod domyślnych,
//ich pola nie muszą być statyczne i finalne,
//metody abstrakcyjne muszą być poprzedzone słówkiem kluczowym abstract,
//przy ich tworzeniu można wykorzystać modyfikatory dostępu public, protected i domyślny,
//klasy mogą rozszerzać tylko jedną klasę, bez względu na to, czy jest ona abstrakcyjna, czy nie.
//Interfejsy
//wszystkie pola są statyczne i finalne, więc trzeba przypisać im jakąś wartość,
//wszystkie metody (poza domyślnymi) są abstrakcyjne i publiczne (nie trzeba więc pisać przy nich public i abstract),
//mogą posiadać metody domyślne zawierające jakiś kod,
//klasy implementować mogą wiele interfejsów.
import java.math.BigDecimal;

public abstract class AbstractTaxiOrderDecorator implements TaxiOrder {

    private final TaxiOrder taxiOrder;

    public AbstractTaxiOrderDecorator(TaxiOrder taxiOrder) {
        this.taxiOrder = taxiOrder;
    }

    @Override
    public BigDecimal getCost() {
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription() {
        return taxiOrder.getDescription();
    }
}
