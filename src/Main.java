import java.util.*;

public class Main {
    public static void main(String[] args){
        //Homework #2
        // 1.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        int nr = sc.nextInt();
        Random rNr = new Random();
        int n = rNr.nextInt(100);
        System.out.println("Numarul randome este: "+n);
        if ( nr < n){
            System.out.println("Numarul introdus este mai mic decat: " + n);
        } else if (nr == n) {
            System.out.println("Numarul introdus este egal cu " + n);
        } else {
            System.out.println("Numarul introdus este mai mare decat: " + n);
        }

        //2.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un caracter: ");
        char a = scanner.next().charAt(0);
        System.out.println("Introduceti un numar: ");
        int nr1 = scanner.nextInt(),
                nr2 = scanner.nextInt();
        switch (a){
            case 'a': //adaugare
                System.out.println("Rezultatul adaugarii: "+(nr1+nr2));
                break;
            case 's': //scadere
                System.out.println("Rezultatul scaderii : "+(nr1-nr2));
            case 'i': //inmultire
                System.out.println("Rezultatul inmultirii : "+(nr1*nr2));
            case 'p': //impartire
                System.out.println("Rezultatul impartirii : "+(nr1/nr2));
            case 'm': //modul
                System.out.println("Rezultatul  restului impartirii: "+(nr1%nr2));
            default:
                System.out.println("Caracterul introdus este invalid!");
        }

        //3.
        int arr[][] = {{1,2,3,4,5},
                       {5,4,3,2,1},
                       {2,3,5,1,4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Primul numar: "+arr[0][0]);
        System.out.println("Primul numar: "+arr[1][0]);
        System.out.println("Primul numar: "+arr[2][0]);

        System.out.println("Ultimul numar: "+arr[0][4]);
        System.out.println("Ultimul numar: "+arr[1][4]);
        System.out.println("Ultimul numar: "+arr[2][4]);

        //4.
        char ar[] ={'a','b','c','d','e','f','g','h','k','l','m','n'};
        for(int i=0; i<ar.length; i=i+2) {
            System.out.printf(String.valueOf(ar[i])+",");
        }System.out.println();

        //5
        double ar1[]={4.1,4.2,4.3,4.4,4.5,4.6,4.7,4.8,4.9,5.1,5.2};
        for (int i =0; i<ar1.length;i++){
            if (ar1[i]<4.5){
                System.out.println("Elemente sub 4.5: "+ar1[i]);
            }
            else if (ar1[i]==4.5){
                System.out.println(ar1[i]);
            }
            else if (ar1[i]>5) {
                System.out.println("Element peste 5: " +ar1[i]);
            }
        }

        //6
        int ar2[]={1,2,3,4,5,6,7,8,9};
        for (int i=0;i< ar2.length;i++){
            if (ar2[i]==2){
                continue;
            } else if (ar2[i]==7) {
                System.out.println("Index valid");
                break;
            }
            System.out.printf(String.valueOf(ar2[i])+",");
        }

        //7
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(39);
        list.add(30);
        int sum=0;
        for (Integer i :list)
            sum +=i;
        System.out.println("Suma: "+ sum);

        //8
        ArrayList<Integer> a1= new ArrayList<Integer>();
        int a11[]= new int[5];
        boolean isNull= Arrays.stream(arr).allMatch(Objects::isNull);
        if(isNull)
            System.out.println("The array is empty");
        else
            System.out.println("The array is not empty");
        System.out.println("Array list is empty? "+a1.isEmpty());
    }
}