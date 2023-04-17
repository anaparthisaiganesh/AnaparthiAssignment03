package Serialization;

import java.io.*;

public class EmployeeDriver {
    public EmployeeDriver(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.txt"))) {
        	EmployeeDriver m1 = new EmployeeDriver(25, "Vinee", 40000);
        	EmployeeDriver m2 = new EmployeeDriver(24, "Manu", 70000);
        	EmployeeDriver m3 = new EmployeeDriver(26, "Ani", 60000);

            out.writeObject(m1);
            out.writeObject(m2);
            out.flush();
            System.out.println("Successfully written objects to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing objects to file: " + e.getMessage());
        }
    }
}

