import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by 2020 on 11/02/2021.
 */
public class Ops {
    int a[]={11,12,13,14,15};
    public  void remove(int []a,int index){
        int i=index;
        while (i<a.length-1){
            a[i]=a[i+1];
            i++;
        }
        a[i]=0;
    }
    public void seertionsort(int []a){
        for (int i = 1; i <a.length ; i++) {
            int cur=a[i];
            int j=i;
            while (j>0&&cur<a[j-1]){
                a[j]=a[j-=1];
                j--;
                a[j]=cur;
            }


        }
    }
    public int sequentialsearch(int [] a,int element){
        int index=-1;
        int i=0;
        boolean flag=false;
        while (!flag&& i<a.length){
            if (a[i]==element){
                flag=true;
                index=i;

            }
            i++;
        }
        return index;
    }
    public  void fillRandom(){
            Random r=new Random();
        r.setSeed(System.currentTimeMillis());
        for (int i = 0; i <a.length ; i++) {
            a[i]=r.nextInt(101);

        }




    }
    public void insersh(int a[]){
        for (int i = 0; i <a.length ; i++) {
            int cur=a[i];
            int j=i;
            while (j>0&&cur<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[i]=cur;
        }
    }












    public static void main(String[] args) {
        Ops o=new Ops();

//        System.out.println(Arrays.toString(o.a));
//        o.remove(o.a,2);
//        System.out.println(Arrays.toString(o.a));
//        System.out.println(Arrays.binarySearch(o.a,15));
//        System.out.println(Arrays.toString(o.a));
//        o.fillRandom();
//        Arrays.fill(o.a,4);
//        Arrays.sort(o.a);
//        System.out.println(Arrays.binarySearch(o.));

    }
}
