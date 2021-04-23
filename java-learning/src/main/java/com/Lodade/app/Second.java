package com.Lodade.app;

public class Second implements Runnable{
    protected int testMe;
    Insider insider = new Insider();
    private enum States {
        Dead,
        Alive
    }
    States personal = States.Alive;

    public Second(int num){
        this.testMe = num;
    }

    public void changeTestMe(int num){
        this.testMe = num;
        insider.showYourself();
    }

    public int showTestMe(){
        return testMe;
    }

    public int doubleTest(){
        return this.testMe * 2;
    }

    public void checkMe(){
        if(personal == States.Alive)
        {
            System.out.println("I lived bitch");
        }else{
            System.out.println("Bleh");
        }   
    }

    public void showMyStates(){
        for(States myVar : States.values()){
            System.out.println(myVar);
        }
    }

    public void run(){
        System.out.println("Second");
    }

    private class Insider{
        private void showYourself(){
            System.out.println("Shh Insider is hiding");
        }
    }
}
