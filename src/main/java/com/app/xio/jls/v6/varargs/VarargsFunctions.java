package com.app.xio.jls.v6.varargs;

/**
 * Varargs allow to take zero or N number of arguments in a method.
 * <p>
 * While using the varargs, you must follow some rules otherwise program code
 * won't compile.<br/>
 * The rules are as follows:<br/>
 * <ol>
 * <li>There can be only one variable argument in the method.</li>
 * <li>Variable argument (varargs) must be the last argument.</li>
 * </ol>
 * </p>
 * 
 * @author ihspa
 *
 */
public class VarargsFunctions {

	public static void main(String[] args) {
		simpleVarArgMethod(1, 3, 4, 5);

	}

	public static void simpleVarArgMethod(Integer... integers) {
		System.out.println(integers);
		for (Integer i : integers) {
			System.out.println(i);
		}
	}

}
