#include <stdio.h>
#include <iostream>
#include <conio.h>
using namespace std;

int main(void)
{
 int i;
 cout<<"fizzbuzz"<<endl<<endl;
 for(i=0;i<=30;i++)
 {
                   cout<<"  "<<i;
                   if(i%3==0)
                   {
                             cout<<"fizz";
                             }
                   if(i%5==0)
                   {
                                  cout<<"buzz"<<"  ";
                                  }
}
             getch();
}
