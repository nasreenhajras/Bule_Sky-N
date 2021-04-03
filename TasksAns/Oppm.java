/**
 * Created by 2020 on 03/02/2021.
 */
public class Oppm {
    int []a={11,12,13,14,15};

    public static void main(String[] args) {
Oppm x=new Oppm();
        x.print();
       System.out.println();
        x.reverse();
x.print();
        x.shiftright();
        x.print();
        System.out.println();
        x.shiftleftt();
        x.print();
    }
  public void reverse()
  {
      int n=a.length-1;
      for (int i = 0; i <a.length/2 ; i++) {
          int t=a[i];
          a[i]=a[n];
          a[n] =t;
          n--;

      }

  }
  public void print() {
      System.out.print("[");
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]);
          if (i != a.length - 1)
              System.out.println(",");

          else
              continue;
      }

     System.out.print("]");
  }
  public  void  shiftright()
  {
      int i;
      for (i = 0; i >a.length ; i--) {
          a[i]=a[i-1];

      }
      a[i]=0;
  }
  public void shiftleftt(){
      int i;
      for (i = 0; i < a.length-1; i--) {
          a[i]=a[i-1];

      }
      a[i]=0;
  }

}
