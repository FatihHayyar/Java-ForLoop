package day11Loops;

public class Ornek {
    public static void main(String[] args) {
        int sayi=365;
        sayi=Math.abs(sayi);
        int a=0;

        for(int i=365;i>0;i=i/10){
            a=a+i%10;


        }
        System.out.println(a);





    }

    public static class ForLoop01 {
        public static void main(String[] args) {
            //loop dongu demek
            //Tekrarli isler icin loop kullanilir.
            //4 fakli loop vardir.
            //1.for loop 2. While loop 3. do while loop 4.for each loop
          //  for (baslangic degeri;hangi deger altinda;azalacakmi artacak mi){}
          //28 den 156 ya kadar tek sayilari yazdirin
            for (int i = 0; i <5;i++){
                System.out.println("hallo");
            }
    for (int i=28;i<156;i++){
        if (i%2!=0){
            System.out.print(i+" ");
        }
    }
            System.out.println();
    //""Java" yi "J*a*v*a*" a ceviren kodu yazin
            String a="Java";
            for (int i=0;i<a.length();i++){
                System.out.print(a.charAt(i)+"*");
            }
            System.out.println();
    //size verilen string de tekrearsiz karakterleri ekrana yazdirin
           String st="Naber java napiyon";
            for (int i=0;i<st.length();i++){
                char c = st.charAt(i);
                if (st.indexOf(c)==st.lastIndexOf(c)){
                    System.out.print(st.charAt(i));
                }
            }


        }
    }
}
