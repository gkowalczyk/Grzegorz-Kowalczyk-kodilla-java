package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

   @Test
   public void testAddTask() {
       //Given
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BoardConfig.class);
       Board board = applicationContext.getBean(Board.class);
       //lub krócej z uzyciem @Autowired
       // Board board;
       //When
       String taskToDo = "task to do";
       String taskInProgress = "task in progress";
       String taskDone = "task done";
       board.getToDoList().addTask(taskToDo);
       board.getInProgressList().addTask(taskInProgress);
       board.getDoneList().addTask(taskDone);
       //Then
       assertEquals(taskDone,board.getDoneList().getTasks().get(0));
       System.out.println(board.getDoneList().getTasks().get(0));
       assertEquals(taskToDo,board.getToDoList().getTasks().get(0));
       System.out.println(board.getToDoList().getTasks().get(0));
       assertEquals(taskInProgress,board.getInProgressList().getTasks().get(0));
       System.out.println(board.getInProgressList().getTasks().get(0));
   }
}
