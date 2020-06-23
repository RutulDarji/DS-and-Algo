package DataStructure.queue;

public class CircularTourToPetrolPump {

    static class PetrolPump {

        int petrol;
        int distance;

        public PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }


    public static void main(String[] args)
    {

        PetrolPump[] arr = {new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)};

        int start = printTour(arr, arr.length);
        
        System.out.println(start == -1 ? "No Solution" : "Start = " + start);

    }

    private static int printTour(PetrolPump[] arr, int length) {

        int start = 0;
        int end  = 1;

        int curr_petrol = arr[start].petrol - arr[start].distance;

        while (end!=start || curr_petrol<0) {

            while (end!=start &&curr_petrol<0) {
                curr_petrol -= arr[start].petrol - arr[start].distance;
                start = (start+1)% length;

                if (start==0) {
                    return -1;
                }

            }
            curr_petrol += arr[end].petrol - arr[end].distance;
            end = (end+1)% length;
        }
        return start;
    }

}
