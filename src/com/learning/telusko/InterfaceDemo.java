package com.learning.telusko;

interface Machine{
    void deviceType();
}

class Desktop implements Machine{
    public void deviceType(){
        System.out.println("On a Desktop");
    }
}
class Laptop implements Machine{
    public void deviceType(){
        System.out.println("On a Laptop");
    }
}

class Developer{
    public void developApp(Machine machine){
        System.out.println("Developing an App now.");
        machine.deviceType();
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        Developer chaitanya = new Developer();

        Machine machine = new Laptop();
        chaitanya.developApp(machine);

        machine = new Desktop();
        chaitanya.developApp(machine);
    }
}
