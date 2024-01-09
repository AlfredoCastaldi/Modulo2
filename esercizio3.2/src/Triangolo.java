public class Triangolo extends Forma{



     public Triangolo(double altezza, double base){
         super(altezza, base);
     }

     public double getArea(){
         return super.getArea()/2;
     }

}
