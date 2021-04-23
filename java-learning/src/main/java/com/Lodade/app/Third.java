package com.Lodade.app;

public class Third extends Second{
    private int useMe;

    public Third(int num1, int num2){
        super(num1);
        this.useMe = num2;
    }

    public int grabUseMe(){
        return useMe;
    }
}
