package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : https://java2blog.com/find-subsets-set-power-set/
 * */
public class SubsetBit {

    public static void findPowerSet(int arr[]) {

        int n = arr.length;
        for (int i=0;i<(1<<n);i++) {
            System.out.print("{ ");
            int m =1;
            for (int j=0;j<n;j++) {
                if ((i&m)>0) {
                    System.out.print(arr[j]+" ");
                }
                m = m << 1;
            }
            System.out.print("}");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int set[] = {1 ,2, 3};
        findPowerSet(set);
    }

}
