package com.app.rc.GettingStartedWithJava6.staticImports;

/* This is static import */
import static java.lang.System.out;

/**
 * <p>
 * Static import facilitates accessing the classes without having to provide the
 * class names. But overuse of Static import should be strictly avoided as it
 * will make programs unreadable.
 * </p>
 * 
 * @author ihspa
 *
 */
public class StaticImport {

	public static void main(String[] args) {
		out.println("Hello...");
	}
}
