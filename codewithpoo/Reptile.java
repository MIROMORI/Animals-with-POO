package codewithpoo;

public class Reptile extends Animal{
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
        System.out.println(this + " is crawling");
    }
    @Override
    public void eat(){
        System.out.println(this + " is eating insects");
    }
    @Override
    public void makeSound(){
        System.out.println(this + " is making reptile sounds");
    }

}
