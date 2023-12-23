package codewithpoo;

public abstract class Animal {
    //atributes
    protected float weight;
    protected int age, members;

    //methods
    public abstract void move();
    public abstract void eat();
    public abstract void makeSound();

    //especial methods
    public void setWeight(float w){
        this.weight = w;
    }
    public void setAge(int a){
        this.age = a;
    }
    public void setMembers(int m){
        this.age = m;
    }
    public float getWeight(){
        return this.weight;
    }
    public int getAge(){
        return this.age;
    }
    public int getMembers(){
        return this.members;
    }
}