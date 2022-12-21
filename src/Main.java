import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadacha 1
        /*Scanner sc = new Scanner(System.in);
        int san = sc.nextInt();
        int san1 = sc.nextInt();
        System.out.println(san+san1);
        System.out.println(san*san1);
        System.out.println((san+san1)/2d);*/

        //Zadacha 3
       /* for (int i = 0; i <3; i++) {
            System.out.println("*****");
        }*/

        //Zadacha 4
       /*Scanner sc = new Scanner(System.in);
        System.out.print("Kaza berse tubu jok.Kaida barsa jugu jok.Kadry bar unu jok..?");
        boolean joop = false;
        for (int i = 0; i < 3; i++) {
            String soz = sc.nextLine();
            if (joop == true) {
                break;
            }
            switch (soz) {
                case "Oi":
                    System.out.println("Joop tuura");
                    break;
                case "Altyn":
                    System.out.println("Bashka varianttardy karap korunuz");
                    break;
                case "Bilbeim":
                    System.out.println("Dagy oilonup korunuz");
                    break;
                default:
                    System.out.println("Tuura joobu jok");
                    break;
            }
        }*/

        //Massivter=pozitiv

       /* int[] mass =  {2, -5, 7, 9,8};
        int sum =1;
        for (int i = 0; i < mass.length ; i++) {
            sum += mass[i];

            System.out.print(mass[i]);
            if (mass[i]!=mass[mass.length-1]){//mass[4]=8 mass[4]=8
                System.out.print("+");
            }
        }

                System.out.println("="+sum);
        System.out.println(sum/mass.length);*/

        //negativ
       /* int[] array = new int[]{10,6,9,3,4};
        int count = array[0];
        System.out.println(count);
        for (int i = 1; i < array.length; i++) {
            count -= array[i];
            //System.out.println(mass[i]);
            if (array[i] != array[array.length-1]) {
                System.out.println("-"+array[i]);
            }
        }
        System.out.println("=" );
        System.out.println(count );*/

       /* method(50,100);
    }
    static void method(int a,int ai){
        Random rn = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(a, ai);
            //int[]=

        }
        System.out.println(Arrays.toString(array));*/

        /*Random rn = new Random();
        int[] array =new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i]= rn.nextInt(100);
            System.out.println(array[i]);
            if(i%2==0){
                System.out.println("jup san");
            }else {
                System.out.println("tak san");
            }
            sum+=array.length;

            System.out.println(sum/ array.length);*/


        //}
       /* Scanner sc = new Scanner(System.in);
       /* int a = sc.nextInt();
        int kosh = 0;
        while (a>0){
            a+=7;
            System.out.println(a);
           break;

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while (a>0){
            a+=a;
            System.out.println(a);
            break;
        }*/
        //int[] mass = {1,2,3,4};

       /* int[] mass = {1, 2, 3, 4};
        for (int i = 0; i < mass.length; i++) {
          if(i< mass.length){
              int sum = mass[i];
          }

            System.out.println(mass[i]);


        }*/
        //1variant
        // System.out.println(met(34,4));
        // }
    /*static int met(int a, int b){
        if (a<b){
            return a;
        }else
            return b;
    }*/
        //2var
        /*met(34,8);
    }
    static void met(int a,int b){
        System.out.println(Math.max(a,b));
      }*/
        //3var
        /*met(43,9);
    }
    static void met(int a,int b){
        System.out.println(a>b?b:a);
    }*/
        //generasii
       /*met(10,15);
    }
    static void met(int a,int b){
        Random rn = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(a, b);

        }
        System.out.println(Arrays.toString(arr));

    }*/
        /*met(10, 10, 10, 10, 10);
    }

    static void met(int... s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }*/

        /*String[] a = {"Timurlan", "Nurperi", "Aziza"};
        for (String b : a) {
            System.out.println(b);

        }*/

        /*String soz = "muzrob";
        String soz1 = "muzrobek";
        System.out.println(soz.concat("a"));
        System.out.println(soz1.trim());
        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();
        System.out.println(met(scanner.nextLine()));
    }

    static String met(String s) {
        return "Hello " + s.toUpperCase();
    }
}*/

        /*Random rn = new Random();
        int[] array = new int[150];
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10, 100);
            System.out.println(array[i]);
            if (array[i]==0) {
                System.out.println(array[i]);*/

               /* int n,p;
            n=scan.nextInt();
            for (p=10;p<100;p=p+10 ) {
                System.out.println(p+7);
            }*/




        /*System.out.print("Ведите любое число ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (n > 0) {
                sum = n % 10;
                System.out.print(sum);
                n = n / 10;
            } else
                System.out.println("kata");
        }*/









