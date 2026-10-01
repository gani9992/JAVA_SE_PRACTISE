
@FunctionalInterface // this is not mandatory if it has only one method
interface A {
  void hai();

  @FunctionalInterface // this is not mandatory if it has only one method
  interface B {
    void hello();

    @FunctionalInterface // this is not mandatory if it has only one method
    interface C {
      void welcome();
    }
  }

}

public class Round2 {
static public void main(String...arg)
{

A r= new A(){
  void hai(){

  }
}
A.B v=new new A.B(){
  void hello(){

  }
}
A.B.C z=new A.B.C(){
  void welcome(){
  v
  }
};
r.hai();
v.hello();
z.welcome();

}
}