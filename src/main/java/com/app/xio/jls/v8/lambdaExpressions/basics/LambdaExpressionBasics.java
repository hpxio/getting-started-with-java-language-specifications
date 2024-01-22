package com.app.xio.jls.v8.lambdaExpressions.basics;


@FunctionalInterface
interface ILambdaExpressionBasics {
    void print(); // a method with no param no return
}

interface ILambdaExpressionSingleParamSAM {
    void print(String a);
}

interface ILambdaExpressionDoubleParamSAM {
    void print(int a, int b);
}

interface ILambdaExpressionWithReturnType {
    int sum(int a, int b);
}

public class LambdaExpressionBasics {
    public static void main(String[] args) {
        ILambdaExpressionBasics basicExpression = () -> System.out.println("Basic Expression -> Hello");
        basicExpression.print();

        ILambdaExpressionSingleParamSAM singleParamSAM = (a) -> System.out.println(a.toUpperCase());
        singleParamSAM.print("Single Parameter LE -> Hello");

        ILambdaExpressionDoubleParamSAM doubleParamSAM = (a, b) -> System.out.println(a + "-" + b);
        doubleParamSAM.print(23, 45);

        ILambdaExpressionWithReturnType returnTypeExpression = (a, b) -> a * 2 + b * 5;
        singleParamSAM.print(String.valueOf(returnTypeExpression.sum(2, 3)));
    }
}
