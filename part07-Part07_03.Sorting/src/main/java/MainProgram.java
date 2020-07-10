
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int [] array){
        int smallest = array[0];
        for(int i : array){
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int [] array){
        int smallest = smallest(array);
        for(int i = 0; i < array.length; i++){
            if(smallest == array[i]){
                return i;
            }
        }
        return smallest(array);
    }
    
    public static int indexOfSmallestFrom(int [] array, int startIndex){
        int copyStart = startIndex;
        int[] copy = new int[array.length-startIndex];
        for(int i = 0; i < copy.length; i++){
            copy[i] = array[copyStart];
            copyStart++;
        }
        return startIndex + indexOfSmallest(copy);
        
        
    }
    
    public static void swap(int[] array, int index1, int index2){
        int copy = array[index1];
        array[index1] = array[index2];
        array[index2] = copy;
    }
    
    public static void sort(int[] array){
        for(int i= 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array,i));
        }
    }
}
    

