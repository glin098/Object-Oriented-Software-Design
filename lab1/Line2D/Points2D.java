public class Points2D
{
   private int x;
   private int y;
   private float r;

   public Points2D()
   {
      this.x = 0;
      this.y = 0;
      this.r = 0;
   }

   public Points2D(int x, int y, float r)
   {
      this.x = x;
      this.y = y;
      this.r = r;
   }

   int getX()
   {
      return this.x;
   }

   int getY()
   {
      return this.y;
   }

   float getR(){
      return this.r;
   }

   public String toString()
   {
      String val = "Circle with radius " + r + " centered at (" + x + ", " + y + ")";
      return val;
   }
}
