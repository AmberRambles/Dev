function parseMonth (monthNum) {
    switch (monthNum){
        case 0:
            return "January";
            break;
        case 1:
            return "February";
            break;
        case 2:
            return "March";
            break;
        case 3:
            return "April";
            break;
        case 4:
            return "May";
            break;
        case 5:
            return "June";
            break;
        case 6:
            return "July";
            break;
        case 7:
            return "August";
            break;
        case 8:
            return "September";
            break;
        case 9:
            return "October";
            break;
        case 10:
            return "November";
            break;
        case 11:
            return "December";
            break;
    }
}
window.onload = function dateSet(){
    let date = new Date();
    let month = date.getMonth();
    let day = date.getDate();
    let year = date.getFullYear();
    let dateString = "Today is: "
    month = parseMonth(month);
    dateString += month + " " + day + ", " + year;
    //console.log(dateString);
    document.getElementById("dateBox").innerHTML = dateString;
};

let masterCount = 0;

function add () {
    if(document.getElementById("textInput").value === ""){
        //if the text input is empty, alert user to add value
        alert("Cannot add empty task.");
    }
    else{
        let inputItem = document.getElementById("textInput").value;
        let listItem = document.createElement("input");
        let listLabel = document.createElement("label");
        let idPrefix = "todo";
        let newId = idPrefix + masterCount;
        listItem.setAttribute("type", "checkbox");
        listItem.setAttribute("id", newId);
        listItem.value = inputItem;
        listItem.name = inputItem;
        listLabel.setAttribute("for", newId);
        listLabel.innerHTML = inputItem;
		listItem.addEventListener('change', function() {
	if(this.checked){
		//console.log("Check");
		let target = document.getElementById("haveDones");
		let one = this;
		let two = one.nextSibling;
		let three = two.nextSibling;
		target.appendChild(one);
		target.appendChild(two);
		target.appendChild(three);
	}
	else{
		//console.log("Uncheck");
		let target = document.getElementById("toDos");
		let one = this;
		let two = one.nextSibling;
		let three = two.nextSibling;
		target.appendChild(one);
		target.appendChild(two);
		target.appendChild(three);
	}
});
        document.getElementById("toDos").appendChild(listItem);
        document.getElementById("toDos").appendChild(listLabel);
        let newBreak = document.createElement("br");
        document.getElementById("toDos").appendChild(newBreak);
        masterCount++;
    }
}
