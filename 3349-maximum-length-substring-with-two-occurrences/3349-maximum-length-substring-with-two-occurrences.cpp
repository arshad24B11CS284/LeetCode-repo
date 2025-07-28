class Solution {
public:
    int maximumLengthSubstring(string s) {
        int maxlen = 0;
        for(int start=0;start<s.length();start++){
            for(int end = start;end<s.length();end++){
                unordered_map<char ,int> map;
                bool isvaild = true;

                for(int ch =start;ch<=end;ch++){
                    map[s[ch]]++;
                    if(map[s[ch]] >2){
                        isvaild = false;
                        break;
                    }

                }
                
                if(isvaild){
                    int len = end - start + 1;
                    maxlen = max(maxlen, len);
                }

            }
        }
        return maxlen;
        
    }
};