// Last updated: 03/07/2026, 11:38:08
class Solution {
    public boolean isDigitorialPermutation(int n) {
        int[] fact=new int[10];
        fact[0]=1;
        for(int i=1;i<10;i++){
            fact[i]=fact[i-1]*i;
        }
        int x=n;
        int ans=0;
        while(x!=0){
            ans+=(fact[x%10]);
            x=x/10;
        }
        return method(ans,n);
    }
    public boolean method(int ans,int n){
        int[] c1=new int[10];
        while(ans!=0){
            c1[ans%10]++;
            ans=ans/10;
        }
        int[] c2= new int[10];
        while(n!=0){
            c2[n%10]++;
            n=n/10;
        }
        return Arrays.equals(c1,c2);
    }
}