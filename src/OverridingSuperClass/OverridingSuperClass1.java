package OverridingSuperClass;

import java.io.FileNotFoundException;

public abstract class OverridingSuperClass1 {
public void Method1()throws FileNotFoundException
{
System.out.println("superclass method");
}
}
public class Demo {
public void Method1() {
System.out.println("Subclass method");
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Demo obj = new Demo();
obj.Method1();
}
}

