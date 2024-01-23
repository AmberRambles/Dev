--helperFunctions.lua

random = math.random

function randomInit()
	math.randomseed(io.time())
	random()
end

