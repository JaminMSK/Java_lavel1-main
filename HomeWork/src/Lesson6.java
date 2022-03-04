/* Сделал Vladislav Torgashev
01.03.2022
 */
public class Lesson6 {

    public static void main(String[] args) {
        Cat1 cat = new Cat1(200);
        Dog dog = new Dog(500, 10);

        IAnimal [] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println("Animals were created: " + Animal.getCountOfAnimals());
    }
}

class Dog extends Animal {
    Dog (int runLimit, int swimLimit){
        super(runLimit, swimLimit);
    }
}

class Cat1 extends Animal {
    Cat1(int runLimit){
        super(runLimit, -1);
    }
    @Override
    public  String swim(int distance){
        return getClassName() + " can't swim";
    }
}

 abstract class Animal implements IAnimal{
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;

    Animal(int runLimit, int swimLimit){
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

     public String getClassName() {
         return className;
     }
     public static int getCountOfAnimals(){
        return countOfAnimals;
     }

     @Override
     public String run(int distance){
        if (distance > runLimit) {
            return  className + " couldn't run " + distance;
        } else {
            return className + "successfully run " + distance;
        }
     }
     @Override
     public String swim(int distance){
         if (distance > swimLimit) {
             return  className + " couldn't swim " + distance;
         } else {
             return className + "successfully swim " + distance;
         }
     }
     @Override
     public String toString() {
        return  className + " runLimit: " + runLimit + ", swimLimit: " + swimLimit;
     }
 }

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}