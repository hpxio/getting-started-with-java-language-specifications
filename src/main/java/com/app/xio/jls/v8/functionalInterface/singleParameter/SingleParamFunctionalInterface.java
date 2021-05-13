package com.app.xio.jls.v8.functionalInterface.singleParameter;
public class SingleParamFunctionalInterface {

	public static void main(String[] args) {
		ISingleParamFunctionalInterface impl = (a) -> System.out.println(a * a);
		impl.print(2);
	}
}
