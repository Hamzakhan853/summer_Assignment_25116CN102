package Day_22;

class Q88{
public static void main(String[] args){
String str="I love Java";
String ans="";

for(int i=0;i<str.length();i++){
if(str.charAt(i)!=' '){
ans=ans+str.charAt(i);
}
}

System.out.println(ans);
}
}
