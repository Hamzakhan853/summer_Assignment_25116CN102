package Day_23;
class Q92{
public static void main(String[]args){
String s="programming";
int[]freq=new int[256];
for(int i=0;i<s.length();i++){
freq[s.charAt(i)]++;
}
char ans=' ';
int max=0;
for(int i=0;i<s.length();i++){
if(freq[s.charAt(i)]>max){
max=freq[s.charAt(i)];
ans=s.charAt(i);
}
}
System.out.println(ans);
}
}