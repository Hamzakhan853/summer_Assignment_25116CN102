package Day_24;

class Q95{
public static void main(String[] args){
String str="I love programming very much";
String arr[]=str.split(" ");
String longest="";
for(int i=0;i<arr.length;i++){
if(arr[i].length()>longest.length())
longest=arr[i];
}
System.out.println(longest);
}
}
