class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        
        unordered_map<int , int> map;
        vector<int> vec;
        for(auto i:nums){
           map[i]++;
        }

        for(auto i:map){
            if(i.second > 1){
                vec.push_back(i.first);
            }
        }
        return vec;
    }
};