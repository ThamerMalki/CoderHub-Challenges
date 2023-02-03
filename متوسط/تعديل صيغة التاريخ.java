public static String date_formating(String date) {
    // write your code here

    String result = "";
    
     result= date.charAt(8)+ "" 
         +date.charAt(9) + "-"+date.charAt(5)+date.charAt(6)+"-"+date.charAt(0)+date.charAt(1)+date.charAt(2)+date.charAt(3);
    return result;
}
