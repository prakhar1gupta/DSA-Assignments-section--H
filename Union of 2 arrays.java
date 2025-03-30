package Programming;
import java.util.*;
public class HashTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1) set.add(i);
        for(int j:arr2) set.add(j);

        System.out.println(set);
        System.out.println(set.size());
    }
}
