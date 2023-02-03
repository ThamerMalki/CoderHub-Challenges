public static String longestZero(String strParam) {
    // write your code here
    
     char[] arr = strParam.toCharArray();
     String currentZeros = "";
     String result = "";
    
    for(int i=0; i<arr.length;i++){
        if(arr[i]=='1'){
            
            if(result.length() < currentZeros.length()){
                result = currentZeros;
            }
            currentZeros = "";
        }    
        else{
            currentZeros += arr[i];
        }
        
        if(arr[arr.length-1] == '0' && i == arr.length-1){
            if(result.length() < currentZeros.length()){
                result = currentZeros;
            }
        }
    }
        
    return result;
    
}
