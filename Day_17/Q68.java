package Day_17;

import java.util.*;
class Q68{
public static ArrayList<Integer> commonElements(int[] a,int[] b,int[] c){
HashSet<Integer> set1=new HashSet<>();
HashSet<Integer> set2=new HashSet<>();
ArrayList<Integer> ans=new ArrayList<>();
for(int num:a){
set1.add(num);
}
for(int num:b){
if(set1.contains(num)){
set2.add(num);
}
}
for(int num:c){
if(set2.contains(num)){
ans.add(num);
set2.remove(num);
}
}
return ans;
}
}
