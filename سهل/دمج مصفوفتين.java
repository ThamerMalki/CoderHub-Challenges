  public static int[] mergeAndOrder(int[] array1, int[] array2) {

    int size = array1.length + array2.length;
    int[] result = new int[size];
      
    for(int i =0 ; i<array1.length ; i++){
        result[i] = array1[i];
    }
      int k = array1.length;
    for(int i=0 ; i<array2.length ; i++){
        result[k] = array2[i];
        k++;
    }
      // Sorting the array in Ascending Order
    for(int i =0; i<result.length ; i++){
        for(int j = i+1 ; j<result.length ; j++){
            int tmp = 0;
            if(result[i] > result[j]){
                tmp = result[i];
                result[i] = result[j];
                result[j] = tmp;
            }
        }
    }
      return result;
}