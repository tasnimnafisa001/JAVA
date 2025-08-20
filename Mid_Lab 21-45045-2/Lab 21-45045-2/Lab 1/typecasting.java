public class typecasting 
{
    short s=45;
    byte b=50;
    int i=55;
    char c=60;
    double d=44.45;
    float f=0.3345f;
    long l=1234554321;
 public static void main(String[] args)
  {
    typecasting tc = new typecasting();
    
    //implict typecasting//

    tc.s=tc.b;
    System.out.println("the bite is :" +tc.b );
    System.out.println("the typecast short is :" +tc.s );

    tc.i=tc.c;
    System.out.println("the char is :" +tc.c );
    System.out.println("the typecast int is :" +tc.i );

    tc.d=tc.l;
    System.out.println("the long is :" +tc.b );
    System.out.println("the typecast double is :" +tc.b );
    
    //explecting typecasting//
    
    tc.f=(float)tc.l;
    System.out.println("the long is :" +tc.l );
    System.out.println("the typecast float is :" +tc.f );

    tc.d=tc.b;
    System.out.println("the bite is :" +tc.b );
    System.out.println("the typecast double is :" +tc.d );
    tc.i=(int)tc.f;
    System.out.println("the float is :" +tc.f );
    System.out.println("the typecast int is :" +tc.i );

  }
  
}    
   
