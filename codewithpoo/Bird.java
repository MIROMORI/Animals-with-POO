package codewithpoo;

public class Bird extends Animal{
    //atributes
    private String feathersColor;


    //especial methods
    public void setFeathersColor(String c){
        this.feathersColor = c;
    }
    public String getFeathersColor(){
        return this.feathersColor;
    }
    
    //methods
    @Override
    public void move(){
        System.out.println(this + " is flying");
    }
    @Override
    public void eat(){
        System.out.println(this + " is eating fruits");
    }
    @Override
    public void makeSound(){
        System.out.println(this + " is making bird sounds");
    }
    public void makeNest(){
        System.out.println(this + " is building a nest");
    }


}
