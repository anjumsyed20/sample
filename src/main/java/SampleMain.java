import java.util.ArrayList;
import java.util.stream.Collectors;

public class SampleMain {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            for (int i=0;i<5;i++)
                System.out.println("in child thread");
        });
        t.start();
        for (int i=0;i<5;i++)
            System.out.println("MAIN");
        ArrayList<Student> s=new ArrayList();
        s.add(new Student(1,"naziya"));
        s.add(new Student(5,"naziya"));
        s.add(new Student(6,"naziya"));
        s.add(new Student(10,"naziya"));
        System.out.println("Average"+s
                .stream()
                .collect(Collectors.averagingInt(st->st.id)));


    }
}
