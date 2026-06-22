package Day_22;
class Q87{
public static void main(String[] args){
String str="programming";
char ch='r';
int count=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i)==ch){
count++;
}
}

System.out.println(count);
}
}
