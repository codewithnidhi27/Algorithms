public class SquareRootUsingBinarySearch {
    public static void main(String[] args) {
        int number = 50;
        int sqrt = squareRoot(0,number,number);
        System.out.println("The approximate square root of a given number is : "+sqrt);
    }

    public static int squareRoot(int start, int end, int number){

        start = 0;
        end = number;
        while(start <= end){
            int mid = start + (end-start)/2;

            if (mid * mid== number ){
                return mid;
            }
            else if (mid * mid > number ){
                end = mid - 1;
            }
            else if (mid *mid < number){
                start = mid + 1;
            }
        }
        return start - 1;
    }
}
