public class Driver{
   public static void main(String []args)
   {
      Points2D p = new Points2D(0, 0, 1);
      Points2D p2 = new Points2D(1, 1, 10);

      Circle2D circle = new Circle2D(p);
      Circle2D circle2 = new Circle2D(p2);
      System.out.println(circle);
      System.out.println(circle2);
   }
}
