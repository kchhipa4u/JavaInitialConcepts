package lec10.oop.boxedprimitive;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.jar.JarFile;

public class BoxedPrimitiveDemo {

	public static void main(String[] args) {
		Integer data = new Integer(Integer.MAX_VALUE);
		System.out.println(data);
		
		System.out.println(Integer.toBinaryString(data));
		
	}
}
