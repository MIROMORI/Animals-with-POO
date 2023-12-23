package codewithpoo;

public class Mammal extends Animal {
    //atributes
    private String furColor;

    //especial methods
    public void setFurColor(String c){
        this.furColor = c;
    }
    public String getFurColor(){
        return this.furColor;
    }

    //methods
    @Override
    public void move(){
        System.out.println(this + " is running");
    }
    @Override
    public void eat(){
        System.out.println(this + " is being breastfed");
    }
    @Override
    public void makeSound(){
        System.out.println(this + " is making mammal sounds");
    }
    
}
