class Solution {
public:
    int maxProduct(int n) {
        vector<int> vec;
        while(n!=0){
            int r = n%10;
            vec.push_back(r);
            n=n/10;
        }
        sort(vec.begin(),vec.end());
        return (vec[vec.size()-1]) * (vec[vec.size()-2]);
    }
};