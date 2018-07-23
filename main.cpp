#include <iostream>
#include <string>
#include <iostream>

using namespace std;

int to_int(char c) { return c-48; }
int calcul_cle(std::string const & code)
{
    int sum_pair=0;
    int sum_impair=0;
    int reste=0;
 for(int i=0;i<code.size();++i){
    if(i%2 == 0){
       sum_pair+=to_int(code[i])*3;
    }
    else{
        sum_impair+=to_int(code[i]);
    }
 }
 reste=(sum_impair+sum_pair)/10;
 if(reste==0){
    return 0;
 }else{
    return 10-reste;
 }
}

int main()
{

    int cle= calcul_cle("303792016200");
    cout <<cle << endl;
    return 0;
}

