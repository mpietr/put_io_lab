public class Puppy {
   int puppyAge;

   public Puppy(String name) {
      // Trzecia zmiana
      System.out.println("Wybrane imie :" + name );
   }

   public void setAge( int age ) {
      puppyAge = age;
   }

   //Pierwsza zmiana

   public int getAge( ) {
      System.out.println("Wiek:" + puppyAge );
      return puppyAge;
   }

   public static void main(String []args) {
      /* Object creation */
      Puppy myPuppy = new Puppy( "tommy" );

      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age */
      myPuppy.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}