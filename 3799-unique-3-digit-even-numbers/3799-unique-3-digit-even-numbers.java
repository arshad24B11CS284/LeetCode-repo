class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            if(digits[i] == 0 ) continue;
            for (int j = 0; j < digits.length; j++) {
                if (i != j) {
                    for (int k = 0; k < digits.length; k++) {
                        if (i != k &&  k!=j)  {
                            int n = digits[i] * 100 + digits[j] * 10 + digits[k];                      
                            if(n%2==0){
                            set.add(n);
                            }
                        }
                    }
                }
            }

        }

        return set.size();
    }
}