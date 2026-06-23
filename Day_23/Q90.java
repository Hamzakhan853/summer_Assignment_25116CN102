package Day_23;
class Q90{
public static void main(String[]args){
String s="abccde";
int[]freq=new int[256];
for(int i=0;i<s.length();i++){
freq[s.charAt(i)]++;
if(freq[s.charAt(i)]==2){
System.out.println(s.charAt(i));
break;
}
}
}
}
