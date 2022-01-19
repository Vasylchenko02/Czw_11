package com.company;
public class Сolory {
    public static void main(String[] args) {
        Color color = new Color(colors.GREEN);
        for(int i = 0; i < 10; i++){
            color.ChangeColor();
            System.out.println(color.toString());

        }    }
}
class Color{
    colors color;
    public Color(colors color){
        this.color = color;
    }
    public  void ChangeColor(){
        switch (color){
            case RED:
                color = colors.YELLOW;
                break;
            case YELLOW:
                color = colors.GREEN;
                break;
            case GREEN:
                color = colors.RED;
                break;
        }
    }
    public String toString(){
        return  "Bieżący kolor : " + color.toString();
    }
}
enum colors{
    RED,YELLOW,GREEN;
}