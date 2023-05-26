package class22;

public interface ArrayUtil {
    //search the array for the number if found return true
    public boolean searchArr(int []array,int number);
}
class Main implements ArrayUtil{


        @Override //this is poly
        public boolean searchArr(int[] arr, int num) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==num){
                    return true;
                }
            }
            return false;
        }

    }

