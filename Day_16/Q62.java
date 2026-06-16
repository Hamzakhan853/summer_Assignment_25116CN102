package Day_16;

import java.util.*;
class Q62{
public static int maxFrequencyElement(int[] arr){
HashMap<Integer,Integer> map=new HashMap<>();
for(int num:arr){
map.put(num,map.getOrDefault(num,0)+1);
}
int maxFreq=0;
int ans=arr[0];
for(int key:map.keySet()){
if(map.get(key)>maxFreq){
maxFreq=map.get(key);
ans=key;
}
}
return ans;
}
public static void main(String[] args){
int[] arr={1,2,2,3,3,3,4};
System.out.println(maxFrequencyElement(arr));
}
}
