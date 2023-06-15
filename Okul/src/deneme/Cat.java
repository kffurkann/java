package deneme;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
    	 Cat myCat = new Cat(); //1
         
    	 Animal myAnimal = myCat; //2
         System.out.println("------------------------------");


         Animal.testClassMethod(); //3
         myAnimal.testInstanceMethod(); //4

         myAnimal.testClassMethod(); //5
         myCat.testClassMethod(); //6
         myCat.testInstanceMethod(); //4

         Animal.testClassMethod(); //7
         Cat.testClassMethod(); //8
   

       
      
    }
}
