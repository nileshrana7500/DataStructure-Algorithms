public class spiral {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        int m = arr.length;
        int n = arr[0].length;
        // define variables
        int minr = 0;
        int maxr = m-1;
        int minc = 0;
        int maxc = n-1;

        while(minr <= maxr && minc <= maxc){
            int a = minc;
            while(a <= maxc){
                System.out.print(arr[minr][a]+" ");
                a++;
            }
            minr++;
            int b = minr;
            while(b <= maxr){
                System.out.print(arr[b][maxc]+" ");
                b++;
            }
            maxc--;
            int c = maxc;
            while(c >= minc){
                System.out.print(arr[maxr][c]+" ");
                c--;
            }
            maxr--;
            int d = maxr;
            while(d >= minr){
                System.out.print(arr[d][minc]+" ");
                d--;
            }
            minc++;
        }
    }
}
