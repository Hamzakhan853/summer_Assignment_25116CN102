package Day_23;
class Q91{
public static void main(String[]args){
String s1="listen";
String s2="silent";
if(s1.length()!=s2.length()){
System.out.println("Not Anagram");
return;
}
int[]freq=new int[256];
for(int i=0;i<s1.length();i++){
freq[s1.charAt(i)]++;
freq[s2.charAt(i)]--;
}
boolean flag=true;
for(int i=0;i<256;i++){
if(freq[i]!=0){
flag=false;
break;
}
}
if(flag){
System.out.println("Anagram");
}else{
System.out.println("Not Anagram");
}
}
}
