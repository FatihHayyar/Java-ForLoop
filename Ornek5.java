package day11Loops;

public class Ornek5 {
    public static void main(String[] args) {
        //size verilen string ddeki m den oncekileri yazdir
        String str="Luksemburg";

        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c=='m') {
               break;
            }
            System.out.print(c);


        }


    }
}
