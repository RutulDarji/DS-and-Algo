package DataStructure.array;

public class SortedArray {

    public int searchData(int array[],int low, int high, int key) {
        if (high<low) {
            return -1;
        }
        int mid = (low+high)/2;
        if (array[mid]==key) {
            return mid;
        }
        if(key>array[mid]) {
            return searchData(array,mid+1,high,key);
        }
        return searchData(array,low,mid-1,key);
    }

    public int insert(int array[], int key, int n, int capacity) {
        if (n>=capacity) {
            return -1;
        }

        int i;
        for (i=n-1;(i>=0 && array[i]>key);i--) {
            array[i+1]=array[i];
        }
        array[i+1]=key;
        return (n+1);
    }

    public int delete(int array[], int n, int key) {

        int pos = searchData(array,0,n-1,key);
        if (pos==-1){
            return -1;
        }

        for (int i=pos;i<n-1;i++) {
            array[i]=array[i+1];
        }

        return (n-1);

    }

    public void printArray(int array[]) {
        for (int currentElement: array) {
            System.out.print(currentElement+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();

        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int n = 6;
        int key = 26;

        sortedArray.printArray(arr);
        int result = sortedArray.insert(arr,26,n,capacity);
        if (result!=-1) {
            System.out.println("Insert Data Successfully");
            sortedArray.printArray(arr);
        }

        int searchKey = 20;
        int searchIndex = sortedArray.searchData(arr,0,n-1,searchKey);
        if (searchIndex!=-1) {
            System.out.println("Key: "+ searchKey+" Found At index: "+ searchIndex);
        } else {
            System.out.println("Not Found key: "+ searchKey);
        }

        int deleteKey = 21;
        int deleteResult = sortedArray.delete(arr,n,deleteKey);
        if (deleteResult!=-1) {
            System.out.println("Key: "+ deleteKey+" Deleted!!");
            sortedArray.printArray(arr);
        } else {
            System.out.println("Not Able to Delete key: "+ deleteKey);
        }


    }
}
