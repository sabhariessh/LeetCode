// Last updated: 12/08/2026, 12:13:55
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int high = 0 , low = 0 ;
4        for( int i : weights ) {
5            high += i ;
6            low = Math.max( low , i ) ;
7        }
8        return find( low , high , weights , days , 0 );
9    }
10    private int find(int start , int end , int  w[] , int  days , int res ) {
11        int d = days;
12        if( start > end )   return  res ;
13        int mid = start + ( end - start ) / 2 , i = 0 ;
14        while( i < w.length ) {
15            int sum = 0 ;
16            while( i < w.length && sum + w[i] <= mid ){
17                sum += w [ i++ ];
18            }
19            d -- ;
20            if( d < 0 )    return find( mid + 1 , end , w , days ,res ) ;
21        }if( d >= 0 )    return find( start , mid - 1 , w , days ,mid ) ;
22        else    return   find( mid + 1 , end , w , days , res ) ;
23    }
24}