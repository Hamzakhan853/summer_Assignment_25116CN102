package Day_16;

class Q61{
public static int missingNumber(int[] arr,int n){
int total=n*(n+1)/2;
int sum=0;
for(int num:arr){
sum+=num;
}
return total-sum;
}
public static void main(String[] args){
int[] arr={1,2,4,5};
int n=5;
System.out.println(missingNumber(arr,n));
}
}
