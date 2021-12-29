package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BoardTestSuite {


    @Test
    void testToString() {
        //given
        //creating the TasksList for todos
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));

        //creating the TaskList for tasks in progress
        TaskList listInProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number " + n)));

        //creating the TaskList for done tasks
        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));

        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);


        //making a shallow clone of object board
        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Board deepCloneBoard  = null;
        try {
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

//When
        board.getLists().remove(listToDo);
        //We właściwości lists przechowujemy tak naprawdę... adres obiektu klasy
        // HashSet w pamięci komputera. Innymi słowy, lists jest referencją do
        // obiektu istniejącego w pamięci
//Then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCloneBoard);

        assertEquals(2,board.getLists().size());
        assertEquals(2, cloneBoard.getLists().size());
        assertEquals(3, deepCloneBoard.getLists().size());

        assertEquals(board.getLists(),cloneBoard.getLists());
        assertNotEquals(board.getLists(),deepCloneBoard.getLists());
}
}
