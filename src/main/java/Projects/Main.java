package Projects;

import java.util.List;

public class Main {

    public void main(String[] args) {

        Score student1 = new Score("ann", 80);
        Score student2 = new Score("bob", 95);
        Score student3 = new Score("cid", 80);
        Score student4 = new Score("dan", 60);

        System.out.println(Score.aboveAverage(List.of(  student1,
                                                        student2,
                                                        student3,
                                                        student4)));
    }
}
