package day11Loops;

public class Ornek2 {
    public static void main(String[] args) {
        //size verilen stringi ekrana ters cevirin
String str="Kayik";
String str1="";
for (int i = 0; i <str.length(); i++) {
    String str2 = str.substring(str.length() - 1-i, str.length() -i);
    str1=str1+str2;
}
        System.out.println(str1);



    }
}
