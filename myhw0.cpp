#include <string>
#include <iostream>
#include <unordered_map>
#include <unordered_set>
#include <vector>

using namespace std;
int main()
{
    unordered_map<string,unordered_set<string>> m;
    string s;
    vector<string> o;
    auto delimiter = "|";
    while (cin >> s){
        auto k = s.substr(0, s.find(delimiter));
        auto v = s.substr(s.find(delimiter)+1, s.size());
        auto i = m.find(k);
        if (i == m.end()){
            m.insert({k, unordered_set<string>{v}});
            o.push_back(k);
        }else{
            i->second.insert(v);
        }
    }
    for (const auto &i:o){
        auto j = m.find(i);
        cout << j->first << "|" << j->second.size() << endl;
    }
    return 0;
}