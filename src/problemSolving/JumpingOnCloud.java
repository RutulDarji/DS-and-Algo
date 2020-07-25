package problemSolving;

public class JumpingOnCloud {

    static int energy(int array[],int k,int n) {
        int energy = 100;

        int i =0;
        while (true) {
            if (array[(i+k)%n]==1) {
                energy = energy -2;
            }
            energy = energy - 1;
            i = (i+k)%n;
            if (i==0) {
                break;
            }
        }

        return energy;
    }

    public static void main(String[] args) {
        int arr1[] ={0,0,1,0,0,1,1,0};
        int k = 2;
        System.out.println("Energy left: " + energy(arr1,k,arr1.length));
    }
}
