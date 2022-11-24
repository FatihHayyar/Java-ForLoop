package day11Loops;

public class Ornek4 {
    public static void main(String[] args) {
        for (int i = 0; i <100; i++) {
            if(i%6==0){
                continue;
            }System.out.print(i+" ");
        }

    }
}
