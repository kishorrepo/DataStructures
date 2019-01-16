import sys
class LinkedList(object):
    def __init__(self):
        self.head = None

    class Node(object):
        def __init__(self, d):
            self.data=d
            self.next=None

    def push(self, new_data):
        new_Node = self.Node(new_data)
        new_Node.next = self.head
        self.head = new_Node

    def printList(self):
        temp_Node = self.head
        while(temp_Node != None):
            print(temp_Node.data)
            temp_Node = temp_Node.next

    def findSecondMax(self):
        #print("In Seconf min function")
        first = sys.maxsize
        secoond = sys.maxsize
        temp_Node = self.head
        while (temp_Node != None):
            if temp_Node.data < first:
                second = first
                first = temp_Node.data
            elif temp_Node.data < second and temp_Node.data != first:
                second = temp_Node.data
            temp_Node = temp_Node.next

        if second == sys.maxsize:
            print("No such Second Max element")
        else:
            print('Second Max element :',second,'\nFirst Min Element :',first)

list = LinkedList()

list.push(1)
list.push(2)
list.push(3)
list.push(4)
list.push(5)
list.push(6)
list.push(7)
list.push(8)

list.printList()
list.findSecondMax()
