package com.interviewQuestions;

class GreetingHi{

    void greet(){
        System.out.println("Hi");
    }
}
class GreetingHello{

    void greet(){
        System.out.println("Hello");
    }
}

class Introduce{
    GreetingHi greetingHi;

    Introduce(){

        greetingHi =new GreetingHi();
    }
    public void introduceYourself() {
        greetingHi.greet();
        System.out.println("This is Deepak");
    }
}

class Client{
    public static void main(String args[]){
        Introduce introduce = new Introduce();
        introduce.introduceYourself();
    }
}
