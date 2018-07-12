/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrationalnumber;

/**
 *
 * @author hamza rehan
 */
public class RationalNumber {
    protected int Numerator;
    protected int denominator;
 
    public RationalNumber()
    {
        this.Numerator=21;
        this.denominator=19;
        
    }
    public RationalNumber(int Numerator,int denominator)
    {
        assert denominator>0;
        this.Numerator=Numerator;
        this.denominator=denominator;
        
    }
    public RationalNumber(RationalNumber originalnumber)
    {
        this(originalnumber.Numerator,originalnumber.denominator);
    }

    
    public int getNumerator()
    {
        return Numerator;
    }
    public void setNumerator(int Numerator)
    {
        this.Numerator=Numerator;
    }
    public void setRationalNumber(int Numerator,int denominator){
        this.Numerator=Numerator;
        this.denominator=denominator;
    }
    public int getdenominator()
    {
        return denominator;
    }
    public void setdenominator(int denominator)
    {
        this.denominator=denominator;
    }
    
    public  RationalNumber add(RationalNumber a,RationalNumber b)
    {
         RationalNumber c=new RationalNumber();
         if(a.denominator==b.denominator)
         {
         
             c.Numerator=a.Numerator+b.Numerator;
             c.denominator=b.denominator;
        }
         else
         {
             c.Numerator=a.Numerator*b.denominator+b.Numerator*a.denominator;
             c.denominator=a.denominator*b.denominator;
         }
        return c;
        
    }
    public RationalNumber add(int d)
    {
        RationalNumber c=new RationalNumber();
        c.Numerator=c.Numerator+d*c.denominator;
        c.denominator=c.denominator;
        return c;
    }
    public RationalNumber mul(RationalNumber a,RationalNumber b){
        RationalNumber c=new RationalNumber();
        c.Numerator=a.Numerator*b.Numerator;
        c.denominator=a.denominator*b.denominator;
        return c;
    }
    public RationalNumber div(RationalNumber a,RationalNumber b){
        RationalNumber c=new RationalNumber();
        c.Numerator=a.Numerator*b.denominator;
        c.denominator=a.denominator*b.Numerator;
        return c;
    }
        public void show(){
            System.out.println();
            System.out.println("HI I AM YOUR RATIONAL NUMBER :");
            System.out.println(""+this.Numerator+"/"+this.denominator);
            
        }
        @Override
        public String toString(){
            System.out.println();
            System.out.println("HI I AM YOUR RATIONAL NUMBER :");
            return"RationalNumber:"+" "+this.Numerator+" / "+this.denominator;
        }
        //public boolean equals(RationalNumber b){
          //  if(this.Numerator==b.Numerator&&this.denominator==b.denominator)
            //return true;
           // else
            //return false;
        //}
        @Override
         public boolean equals(Object other){
            RationalNumber that=(RationalNumber )other;
            return this.Numerator==that.Numerator&&this.denominator==that.denominator;
            
            
        }
    
}
