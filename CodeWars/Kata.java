public class Kata {

    public static void main(String args[]) {
        System.out.println(findEvenIndex(new int[]{1,100,50,-51,1,1}));
    }

    public static int findEvenIndex(int arr[]) {//{1, 2, 3, 4, 3, 2, 1}
        int count = 0, result = 0;
        int length = arr.length;
        for(int i=0; i<length; i++) {
            if(result == sumDownToIndex(arr, i)) return i;
            result += arr[i];
        }
        return -1;
    }

    public static int sumDownToIndex(int arr[], int index) {
        int sum = 0;
        if(index >= arr.length) return -1;
        for(int i = arr.length - 1; i > index; i--) {
            sum += arr[i];
        }
        return sum;
    }

}

//{1, 2, 3, 4, 3, 2, 1} will return 3 cuz 1 + 2 + 3 equals 3 + 2 + 1 so return the index of 4 which is 3.
//so as the array like {1, 100, 50, -51, 1, 1}
