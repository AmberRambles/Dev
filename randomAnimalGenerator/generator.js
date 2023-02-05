

function randNum(number) {
	// Returns a random integer from 1 to number:
	return Math.floor(Math.random() * number) + 1;
}

function generate(){
	document.getElementById("resultsContainer").style.display = "block";
}