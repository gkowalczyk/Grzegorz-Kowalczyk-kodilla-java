package com.kodilla.stream.lambda;

 interface MathExpression {

    public double calculateExpression(double a, double b);
}


class ExpressionExecutor {

    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }
}

        //   ( a, b ) -> a +  b



