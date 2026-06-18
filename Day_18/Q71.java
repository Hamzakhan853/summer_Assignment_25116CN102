package Day_18;

public class Q71{
public static void main(String[] args){
int[] arr={1,2,3,4,5,6,7,8,9};
int target=7;

int low=0;
int high=arr.length-1;

while(low<=high){
int mid=low+(high-low)/2;

if(arr[mid]==target){
System.out.println("Found at index "+mid);
return;
}
else if(arr[mid]<target){
low=mid+1;
}
else{
high=mid-1;
}
}

System.out.println("Not Found");
}
}