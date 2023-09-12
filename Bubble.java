public class Bubble {
    public static void exchange(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void BubbleSort(int[] a){
        int length=a.length;
        for (int i=1;i<=length-1;i++){
            for (int j=0;j<length-i;j++){
                if (a[j]>a[j+1]){
                    exchange(a,j,j+1);
                }
            }
        }
    }
}
