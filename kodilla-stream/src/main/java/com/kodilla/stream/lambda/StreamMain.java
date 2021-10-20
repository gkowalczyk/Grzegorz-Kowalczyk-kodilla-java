package com.kodilla.stream.lambda;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
       // Processor processor = new Processor();
  //1 //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
  // processor.execute(executeSaySomething);
//zamiast powyższego :
    // 2  // Executor codeToExecute =()-> System.out.println("zamiast klasy ExecuteSaySomething ");
    //3processor.execute(codeToExecute);
//processor.execute(() -> System.out.println("Przekaz wprost do argumentu  "));

ExpressionExecutor expressionExecutor = new ExpressionExecutor();

expressionExecutor.executeExpression(1,3, (a,b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);           // [9]

expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);




    }
}
