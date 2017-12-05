package testDuosEtAutres;

 
public class Duo <E>
{
   private E   x , y ;
   public Duo (E x1 , E y1 )
   {
       this.x = x1 ;
       this.y = y1 ;
   }
   public E  getFirst () 
       { return this.x ; }
   public E  getSecond ()
       { return this.y ; }
   public void setFirst (E x1)	
       { this.x = x1 ; }
   public void setSecond (E y1)
       { this.y = y1 ; }
} // Fin classe Duo 

