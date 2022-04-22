#include <iostream>

using namespace std;

int main() {
    const bool DEBUG = false;

    cout << "Hello World, This is Amber's Linter\nThis lints from HTML to HTML-safe\n";
    string beforeLint = "<table><thead><tr><th>Name</th><th>Email</th></tr></thead><tr><td>Tom Thumb</td><td>Example@notreal.com</td></tr><tr><td>Pallas Athena</td><td>summit@olympus.net</td></tr></table>";//This line will be linted.
    string afterLint = "";
    for(int currentPosition = 0; currentPosition < beforeLint.length(); currentPosition++){
        if(DEBUG){
            cout << "If done right, the current char is: " << beforeLint[currentPosition] << "\n";
            cout << "At position: " << currentPosition + 1 << "\n";//+1 for human readability
        }
        if(beforeLint[currentPosition] == '<'){
            afterLint += "&lt;";
        }
        else if(beforeLint[currentPosition] == '>'){
            afterLint += "&gt;";
        }
        else{
            afterLint += beforeLint[currentPosition];
        }
    }
    cout << "Your linted results:\n";
    cout << afterLint;
    cout << "\n\n";
    cout << "Thank You\n";
    return 0;
}