package DataTypes2;
import java.math.BigInteger;
import java.util.*;
public class Data2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger arr[]=new BigInteger[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextBigInteger();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE))<=0&&arr[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE))>=0) {
                System.out.println(arr[i] + " can be fitted in:");
            }else{
                System.out.println(arr[i]+" can't be fitted anywhere.");
            }
            if(arr[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE))<=0&&arr[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE))>=0){
                if(arr[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE))<=0&&arr[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE))>=0){
                    if(arr[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE))<=0&&arr[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE))>=0){
                        if(arr[i].compareTo(BigInteger.valueOf(Byte.MAX_VALUE))<=0&&arr[i].compareTo(BigInteger.valueOf(Byte.MIN_VALUE))>=0){
                            System.out.println("* byte");
                            System.out.println("* short");
                            System.out.println("* int");
                            System.out.println("* long");
                            continue;
                        }
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                        continue;
                    }
                    System.out.println("* int");
                    System.out.println("* long");
                    continue;
                }
                System.out.println("* long");
            }

        }

    }
}