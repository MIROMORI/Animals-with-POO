package codewithpoo;

public class Fish extends Animal {
    //atributes
    private String scaleColor;


    //especial methods
    public void setScaleColor(String c){
        this.scaleColor = c;
    }
    public String getScaleColor(){
        return this.scaleColor;
    }
    
    //methods
    @Override
    public void move(){
        System.out.println(this + " is swimming");
    }
    @Override
    public void eat(){
        System.out.println(this + " is eating substances");
    }
    @Override
    public void makeSound(){
        System.out.println(this + " doesn't make sound");
    }

    public void makeBubbles(){
        System.out.println(this + " is making bubbles");
    }

}
