public class Array10 {
    static void rearrange(int[] A, int n){
        int i=0;
        while(i<n && A[i]<0){
            i++;
        }
        for(int j=i+1;j<n;j++){
            if(A[j]<0){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={-12, 0, -13, -5,0, -7, 5, 0, -6};
        rearrange(arr,9);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
