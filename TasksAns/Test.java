/**
 * Created by 2020 on 08/03/2021.
 */
public class Test {

    public static void main(String[] args) {
        Person p1;
        Studant s1=new Studant(30,"jameela",111);
        p1=s1;       //widenting cast
        System.out.println(p1);
        Person p2=new Studant(20,"hlamnh",222);
        if(p2 instanceof Studant)//handing cast exping
        {

        Studant s2=(Studant) p2;//narwing
        System.out.println(s2);
    }

}}
