class Solution {
    public int similarPairs(String[] words) {
        int cnt = 0;

        for (int i = 0; i < words.length - 1; i++) {
            String outer = words[i];
            Set<Character> seto = new HashSet<>();
            for (char ch=0;ch<outer.length();ch++) {
                seto.add(outer.charAt(ch));
            }
            StringBuilder sb = new StringBuilder();
            for (char ch : seto) {
                sb.append(ch);
            }
            String nouter = sb.toString();
            char arr[] = nouter.toCharArray();
            Arrays.sort(arr);
            String nn_outer = new String(arr);

            for (int j = i + 1; j < words.length; j++) {
                String inner = words[j];
                Set<Character> seti = new HashSet<>();
                for (char ch=0;ch<inner.length();ch++) {
                    seti.add(inner.charAt(ch));
                }
                StringBuilder sbb = new StringBuilder();
                for (char ch : seti) {
                    sbb.append(ch);
                }
                String ninner = sbb.toString();
                char ar[] = ninner.toCharArray();
                Arrays.sort(ar);
                String nn_inner = new String(ar);
                if(nn_outer.equals(nn_inner)){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}