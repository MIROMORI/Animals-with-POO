package codewithpoo;

public class Kangaroo extends Mammal{
    //methods
    public void useBag(){
        System.out.println(this + " is using the bag");
    }
    @Override
    public void move(){
        System.out.println(this + " is jumping");
    }
}
