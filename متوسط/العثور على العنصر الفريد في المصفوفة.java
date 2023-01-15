public static int[] unique(int[] arr) {
    
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> uniq = new ArrayList<Integer>();
        for (int k : arr) {
            list.add(k);
        }
    
        for(int i=0; i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(i != j) {
                    if (list.get(i) == list.get(j))
                        break;
                    else if (j == list.size() - 1)
                        uniq.add(list.get(i));
                }
            }
        }

        for(int i=0; i<list.size()-1;i++){
            if(list.get(list.size()-1) == list.get(i)) {
                break;
            }
            else if (i == list.size()-2) {
                uniq.add(list.get(list.size() - 1));
            }
        }
    
    int[] result = uniq.stream().mapToInt(i -> i).toArray();
    return result;
}
