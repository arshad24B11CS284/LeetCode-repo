class Solution {
public:
    vector<int> findEvenNumbers(vector<int>& digits) {

        vector<int> vec;

        for (int i = 0; i < digits.size(); i++) {
            if (digits[i] != 0) {
                for (int j = 0; j < digits.size(); j++) {
                    if (i != j) {
                        for (int k = 0; k < digits.size(); k++) {
                            if (k != j && k != i) {
                                int num = digits[i] * 100;
                                num = num + digits[j] * 10;
                                num = num + digits[k];
                                if (num % 2 == 0) {
                                    vec.push_back(num);
                                }
                            }
                        }
                    }
                }
            }
        }

        sort(vec.begin(), vec.end());
        unordered_set<int> set;
        for (auto i : vec) {
            set.insert(i);
        }
        vector<int> h;
        for (auto i : set) {
            h.push_back(i);
        }
        sort(h.begin(), h.end());
        return h;
    }
};