public class Circle2D
{
   private Points2D p;
  
   public Circle2D()
   {
      p = new Points2D();
   }

   public Circle2D(Points2D x)
   {
      p = new Points2D(x.getX(), x.getY(), x.getR());
   }

   public String toString()
   {
      String val = p.toString();
      return val;
   }
}
