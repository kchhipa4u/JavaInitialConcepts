package lec30.io.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author kanhaiya.chhipa
 * 
 * You can generate serialVersionUID using below command
 * 
 * C:\Users\kanhaiya.chhipa\workspace\JavaInitialConcepts\bin>serialver lec30.io.serialization.SerializableDemo
lec30.io.serialization.SerializableDemo:    private static final long serialVersionUID = 5523626780420731299L;
 *
 */
public class SerializableDemo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5523626780420731299L;
	
	private String name;
	
	// Demonstrate problem during deserialization process
	private String gender;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private transient int id = 4;

	public int getId() {
		return id;
	}

	public static void doSerialization() {
		System.out.println("\nInside doSerialization ...");

		SerializableDemo serializableDemo = new SerializableDemo();
		serializableDemo.setName("Java");
		System.out.println("name (before serialization): " + serializableDemo.getName());
		System.out.println("id (before serialization): " + serializableDemo.getId());

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("serial.ser")))) {
			out.writeObject(serializableDemo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void doDeserialization() {
		System.out.println("\nInside doDeserialization ...");

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("serial.ser")))) {
			SerializableDemo serializedObj = (SerializableDemo) in.readObject();
			System.out.println("name (after deserialization): " + serializedObj.getName());
			System.out.println("id (after deserialization): " + serializedObj.getId());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//doSerialization();
		doDeserialization();
	}
}
