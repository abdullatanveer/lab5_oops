/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionrunner;

/**
 *
 * @author abdul
 */
 class Fraction {
    private int x ;
    private   int y ;
    private  float fract;


    public  Fraction ( )
    {
        x = 2;
        y = 4;
        fract = (float) x/y;
    }

    public  Fraction ( int xvalue , int yvalue)
    {
       x = xvalue ;
       y = yvalue ;
       fract = (float)  (x/y);


    }

    public  void  Setx(int xValue)
    {
        x  = xValue;
    }


    public  void  Sety(int yValue)
    {
        y  = yValue;
    }

    public  int getX()
    {
        return  x;
    }

    public int getY()
    {
        return y;
    }

    public  void display()
    {
        System.out.println( x +"/" +y +" = " + fract);
    }

    public boolean compare(Fraction f)
    {
        if (x == f.x && y == f.y)
        {
            return  true ;
        }
        else
            return false;
    }
    
}
public class FractionRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction f1= new Fraction(12,3);
        Fraction f2 = new Fraction(12,4);
        f1.display();
        f2.display();
        System.out.println(" f1 equals f2 " + f1.compare(f2)
        );
    }
    
}
