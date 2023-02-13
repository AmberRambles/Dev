let raceNumber = Math.floor(Math.random() * 1000);
let earlyRegistered = true;//initialize, will change in runtime
let playerAge = 18;//initialize, will change in runtime
if (playerAge > 18 && earlyRegistered){
  raceNumber += 1000;
}
if (playerAge > 18 && earlyRegistered){
  console.log('You\'r race will begin at 9:30 AM. Your number is ' + raceNumber);}
else if (playerAge > 18 && !earlyRegistered){
  console.log('You\'r race will begin at 11:00 AM. Your number is ' + raceNumber);}
else if (playerAge < 18){
  console.log('Youth race will begin at 12:30PM. Your number is ' + raceNumber);}
else{
	console.log('See registration desk');}