package day11Loops;

public class ForlLoop3 {
    public static void main(String[] args) {
        //bir stringdeki m ler haric tum karakterleri yazin
        String s="macaristan macunu";
        String msiz="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!='m'){
                msiz=msiz+c;
            }
        }
        System.out.println(msiz);

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c=='m'){
                continue;

            }
        }


    }
}
