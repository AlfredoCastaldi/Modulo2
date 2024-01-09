public class Triangolo extends Forma{



     public Triangolo(double altezza, double base){
         super(altezza, base,Tipo.triangolo);
     }

     public double getArea(){
         return super.getArea()/2;
     }

}
