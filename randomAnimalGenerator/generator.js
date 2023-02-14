const animalArray = ["Cat", "Cow", "Dog", "Donkey"];
const hrefArray = ["./images/manja-vitolic-gKXKBY-C-Dk-unsplash.jpg", "./images/amber-kipp-Mm_D_kbvTUM-unsplash.jpg", "./images/karsten-winegeart-NE0XGVKTmcA-unsplash.jpg", "./images/jacques-bopp-tE2rnQHjdv8-unsplash.jpg"];

function randNum(number) {
	// Returns a random integer from 0 to (number - 1)
	return Math.floor(Math.random() * number);
}

function generate(){
	let index = randNum(animalArray.length);
	document.getElementById("result").innerHTML = animalArray[index];
	document.getElementById("resultImage").setAttribute("alt", animalArray[index]);
	document.getElementById("resultImage").setAttribute("src", hrefArray[index]);
	document.getElementById("resultsContainer").style.display = "flex";
	document.getElementById("generate").innerHTML = "Again";
}