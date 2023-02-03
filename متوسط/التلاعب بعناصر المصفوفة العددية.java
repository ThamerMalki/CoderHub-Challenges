public static int[] filp_even_odd(int[] numbers) {
    // write your code here
    for(int i=0; i<numbers.length ; i++){
        if(numbers[i] % 2 == 0){
            numbers[i] +=1;
        }
        else{
            numbers[i] -=1;
        }
    }
    return numbers;
}
