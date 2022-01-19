package com.company;

public class Main {

    public static void main(String[] args) {
        Figury f1,f2,f3,f4,f5,f6,f7,f8;

        for (Figury f: Figury.values())
            System.out.println((f + "" + f.ordinal()));
        f1=Figury.kwadrat;
        f2=Figury.kolo;
        f3=Figury.trapez;
        f4=Figury.romb;
        f5=Figury.trojkat;
        f6=Figury.owal;
        f7=Figury.szesciokat;
        f8=Figury.prostokat;
    }
}

enum Figury{
    kwadrat,kolo,trapez,romb,trojkat,owal,szesciokat,prostokat
}

