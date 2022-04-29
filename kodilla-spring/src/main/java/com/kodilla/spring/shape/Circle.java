package com.kodilla.spring.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//singleton	Domyślny zasięg beanów. Oznacza, że
// w Kontenerze tworzony jest tylko jeden bean danego typu.
                 //prototype	Zasięg pozwalający na utworzenie wielu
// instancji beanów danego typu w kontenerze.
              //request, session, globalSession, application, websocket
// Zasięgi wykorzystywane przy programowaniu aplikacji
// internetowych – na razie nie będziemy ich używali i
// omówimy je później.

//

@Component
@Scope("singleton")  //zasięg domyślny, w kontenerze tworzymy tylko jeden bean danego typu
public class Circle implements Shape{

    @Override
    public String getShapeName() {
        return "This is a circle.";
    }
}
