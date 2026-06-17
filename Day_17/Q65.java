package Day_17;

class Q65{
public static int[] mergeArrays(int[] a,int[] b){
int n=a.length;
int m=b.length;
int[] ans=new int[n+m];

for(int i=0;i<n;i++){
ans[i]=a[i];
}
for(int i=0;i<m;i++){
ans[n+i]=b[i];
}
return ans;
}
}