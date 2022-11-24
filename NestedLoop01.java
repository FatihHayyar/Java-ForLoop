package day11Loops;

public class NestedLoop01 {
    public static void main(String[] args) {
/*
        1.Example:Type code to get the output like
        Week: 1
        Day: 1
        Day: 2
        Day: 3
                          .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
                          ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
                          ....
         */
for (int i = 1; i <4; i++) {
    System.out.println("Week"+i);
    for (int j = 1; j <4; j++) {

        System.out.println("day"+j);
    }

}




    }
}
