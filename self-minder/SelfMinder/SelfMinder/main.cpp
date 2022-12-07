#include <iostream>
#include <time.h>
#include <string>

using namespace std;

void greeting();
void tasksCheck(string taskList[]);
void actionLoop(string taskList[]);

int main() {
	greeting();
	string taskList[5];
	for (int i = 0; i < 5; i++) {
		taskList[i] = "";
	}
	actionLoop(taskList);
	cout << "Goodbye" << endl;
	return 0;
}

void greeting() {
	cout << "Hello, Amber." << endl;
	time_t now = time(NULL);
	cout << "The time is now: ";
	char str[26];
	ctime_s(str, sizeof(str), &now);
	//cout << str << endl;
	string toPrint = str;
	cout << toPrint.substr(11, 5) << endl;
}

void tasksCheck(string taskList[])
{
	int taskCount = 0;
	for (int i = 4; i > -1; i--) {
		if (taskList[i] != "") { taskCount++; }
	}
	cout << "There are " << taskCount << " assigned tasks." << endl;
}

void actionLoop(string taskList[]) {
	bool running = true;
	while (running) {
		tasksCheck(taskList);
		bool insertionComplete = false;
		cout << "Please select an option:" << endl;
		cout << "1) Add Task" << endl;
		cout << "2) List Tasks" << endl;
		cout << "3) Remove Task" << endl;
		cout << "4) Quit Application" <<endl;
		int selection = 0;
		cin >> selection;
		switch (selection) {
		case 1:
			insertionComplete = false;
			for (int i = 0; i < 5; i++) {
				if ((taskList[i] == "")&&(!insertionComplete)) {
					cout << "Inserting at task " << i + 1 << ":" << endl;
					cout << "Please enter task description:" << endl;
					string entry;
					char charStr[256];
					cin.getline(charStr, 256);
					entry = charStr;
					if (entry != "") { taskList[i] = entry; }
					insertionComplete = true;
				}
				else if ((i == 4) && (taskList[i] != "") && (!insertionComplete)) {
					cout << "No room for task insertion at this time." << endl;
				}
			}
			break;
		case 2:
			for (int i = 0; i < 5; i++) {
				if ((i == 0) && (taskList[i] == "")) {
					cout << "No tasks to display" << endl;
				}
				else if (taskList[i] != "") {
					cout << i + 1 << ") " << taskList[i];
				}
			}
			break;
		case 3:
			//logic for removeTask
			break;
		case 4:
			running = false;
			break;
		default:
			cout << "Selection not understood. Please try again." << endl;
			cin.clear();
			cin.ignore(10);
			cin.clear();
		}
	}
}