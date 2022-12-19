#include <iostream>
#include <ctime>
#include <string>

using namespace std;

void printHanukkia(int numLights);

int main() {
	//cout << "Happy Hanukkah!!" << endl;
	time_t nowTime = time(nullptr);
	char nowTimeStr[26];
	ctime_s(nowTimeStr, sizeof nowTimeStr, &nowTime);
	//cout << "Today is: " << nowTimeStr;
	string nowTimeString = nowTimeStr;
	string yearString = nowTimeString.substr(20, 4);
	string dayString = nowTimeString.substr(8, 2);
	string monthString = nowTimeString.substr(4,3);
	cout << "Today is: " << monthString << " " << dayString;
	cout << ", " << yearString << endl;
	printHanukkia(0);
	if (yearString == "2022") {
		if (monthString == "Dec") {
			 //
		}
	}
	else { cout << "Sorry, this program only supports Hanukkah 2022." << endl; }

	return 0;
}

void printHanukkia(int numLights) {
	string wick = "   i   ";
	string taper = "  |8|  ";
	string candleStickSlice = " ##### ";
	string candleStickBase =  "#######";
	string candleCenter =     "   #   ";
	string hanukkia = "";
	hanukkia += wick + "\n";
	hanukkia += wick + "\n";
	hanukkia += taper + "\n";
	hanukkia += taper + "\n";
	hanukkia += taper + "\n";
	hanukkia += taper + "\n";
	hanukkia += taper + "\n";
	hanukkia += candleStickSlice + "\n";
	hanukkia += candleStickSlice + "\n";
	hanukkia += candleStickBase + "\n";
	hanukkia += candleStickBase + "\n";
	hanukkia += candleStickBase + "\n";
	hanukkia += candleCenter + "\n";
	hanukkia += candleCenter + "\n";
	hanukkia += candleCenter + "\n";
	hanukkia += candleCenter + "\n";
	cout << hanukkia;
}