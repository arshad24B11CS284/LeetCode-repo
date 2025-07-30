class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
       map<int,int> mp;
         vector<int> res;

        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        
        vector<vector<int>> vc ;

        for(auto num : mp){
            vector<int> temp;
            temp.push_back(num.second);
            temp.push_back(num.first);
            vc.push_back(temp);
        }

        sort(vc.begin(),vc.end());
        
        for(auto num = vc.size()-1 ; num>=0 ;num--){
            res.push_back(vc[num][1]);
            k--;
            if(k==0) break;
        }

       
        return res;

    }
};