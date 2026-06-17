package Day_17;

import java.util.*;
class Q66{
public static ArrayList<Integer> unionArray(int[] a,int[] b){
HashSet<Integer> set=new HashSet<>();
for(int num:a){
set.add(num);
}
for(int num:b){
set.add(num);
}
return new ArrayList<>(set);
}
}