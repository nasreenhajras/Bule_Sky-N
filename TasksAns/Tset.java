/**
 * Created by 2020 on 24/03/2021.
 */
public class Tset {
    public static void main(String[] args) {
        ArrayQueue<String>d=new ArrayQueue<>(3);
        d.enqueu("jameee");
        d.enqueu("somonnn");
        d.enqueu("zanb");
        while (!d.isEmpty());
        System.out.println(d.dequeue());

    }
}
