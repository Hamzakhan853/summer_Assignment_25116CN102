package Day_16;

import java.util.*;
class Q63{
public static void pairSum(int[] arr,int target){
HashSet<Integer> set=new HashSet<>();
for(int num:arr){
int need=target-num;
if(set.contains(need)){
System.out.println(need+" "+num);
return;
}
set.add(num);
}
System.out.println("No Pair Found");
}
public static void main(String[] args){
int[] arr={2,7,11,15};
int target=9;
pairSum(arr,target);
}
}
