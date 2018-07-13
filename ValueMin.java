public class ValueMin {
    public static int valueMin(int[] array){
        int min = array[0];
        int index = 0;

        for(int i =1; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array={4,12,7,8,1,6,9};
        int index = valueMin(array);
        System.out.println("Gia tri nho nhat trong day la "+array[index]);
    }

}
