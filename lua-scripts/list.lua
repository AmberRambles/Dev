function createNode(nodeData)
	local node = {}
	node.prevRef = nil
	node.nextRef = nil
	node.data = nodeData
	return node
end

function createList()
	local list = {}
	list.1 = createNode("HEAD")
	list.2 = createNode("TAIL")
	list.1.nextRef = "2"
	list.2.prevRef = "1"
	return list
end

function appendList(listObject)
	local endNumber = 1
	local seeking = true
	while (seeking) do
		local endIndex = tostring(endNumber)
		--check for tail
		if (listObject[endIndex][data] == "TAIL") then
			--TODO 01 retain endIndex and push tail back one

			--TODO 02 insert new node at old endIndex

			--make seeking false to leave the while loop
			seeking = false
		else
			endNumber = endNumber + 1
		end
	end
end
