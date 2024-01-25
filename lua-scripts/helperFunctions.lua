--helperFunctions.lua

random = math.random

function randomInit()
	math.randomseed(io.time())
	random()
end

function printSlow(usrString, seconds)
	if seconds == nil
		then seconds = 1
	end
	local startTime = os.time()
	local endTime = startTime + seconds
	--the following line is not as precise as I aould like, but it does suffice
	--the delay has a margin of error of one second
	while endTime >= os.time()
		do startTime = startTime + 1
	end
	print(usrString)
end

