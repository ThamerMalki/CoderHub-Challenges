public static String sortByLength(String txt) {
    
    String[] arr = txt.split(" ");
    
    for(int i=0;i<arr.length; i++){
        for(int j=0+i; j<arr.length; j++){
            if(arr[i].length() > arr[j].length()){
                String temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                break;
            }
        }
    }
    String result = "";
    
    for(String x : arr){
        result+= x+" ";
    }
    return result.trim();
}
