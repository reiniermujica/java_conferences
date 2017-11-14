abstract class Trabajador{

  protected String nombre;
  protected float sb;    // salario basico
  protected float dt;    // dias trabajados

  public Trabajador(String nombre, float sb, int dt){
    this.nombre=nombre;
    this.sb=sb;
    this.dt=dt;
  }
  
  public abstract salario();
}
 
 clase A{
	  ...
  método pro1
  ...
}

  	clase B que hereda de A{
  ...
  método pro1
  ...
}

class Uno{
  protected int a;
  protected int b;
  public Uno(int a, int b){
    this.a=a;
    this.b=b;
  }
  public int calcula(){
    return a+b;
  }
}

class Dos extends Uno{
  private int c;
  public Dos(int a, int b, int c){
    super(a,b);
    this.c=c;
  }
  public int calcula(){
    return super.calcula()+c;
  }
}

class Ejemplo{
   public static void main(String[] args){
           Uno  d=new Dos(3,4,5);
      System.out.println(d.calcula());
   }
} 


abstract class TUno{
  protected int a;
  public TUno(int a){
    this.a=a;
   }
}

class TDos extends TUno{
  protected int b;
  protected int c;
  public TDos(int a, int b, int c){
    super(a);
    this.b=b; this.c=c;
  }
  public int calcula(){
    return b+c;
  }
}

class TTres extends TUno{
  protected int e;
  protected int f;
  public TTres(int a, int e, int f){
    super(a);
    this.e=e; this.f=f;
  }
  public int calcula(){
    return e+f;
  }
}

class Ejemplo1{
   public static void main(String[] args){
     
      TUno  d=new TDos(3,4,5);
      System.out.println(d.calcula());
   }
}

abstract class TUno{
  protected int a;
  public TUno(int a){
    this.a=a;
   }
  public abstract int calcula();
}





