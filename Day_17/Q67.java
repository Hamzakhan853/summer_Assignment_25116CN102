package Day_17;

import java.util.*;
class Q67{
public static ArrayList<Integer> intersectionArray(int[] a,int[] b){
HashSet<Integer> set=new HashSet<>();
ArrayList<Integer> ans=new ArrayList<>();
for(int num:a){
set.add(num);
}
for(int num:b){
if(set.contains(num)){
ans.add(num);
set.remove(num);
}
}
return ans;
}
}