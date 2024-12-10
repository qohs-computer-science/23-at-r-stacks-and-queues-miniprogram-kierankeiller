//Kieran Keiller, Pd. 3, 12/9/24
//This program tests the utility of stacks and queues and uses them to duplicate numbers and to sort numbers.

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {
    Scanner myScn = new Scanner(System.in);
    Stack <Integer> myStack = new Stack <Integer> ();

    for (int i = 0; i<5; i++){
    System.out.print("Enter a whole number: ");
    myStack.push(myScn.nextInt());
    }//end for

    System.out.println("Original Stack:");
    System.out.println(myStack);

    Stack <Integer> tempStack = new Stack <Integer>();
    while(!myStack.isEmpty()){
        tempStack.push(myStack.pop());
    }//end first while to flip into tempStack
    while(!tempStack.isEmpty()){
        int popped = tempStack.pop();
        myStack.push(popped);
        myStack.push(popped);
    }//end second while to flip back into myStack

    System.out.println("Duplicated Stack:");
    System.out.println(myStack + "\n");

    Queue <Integer> myQ = new LinkedList <Integer>();
    for (int i = 0; i<10; i++){
    System.out.print("Enter a whole number: ");
    myQ.add(myScn.nextInt());
    }//end for

    System.out.println("Original Queue:");
    System.out.println(myQ);

    Queue <Integer> evens = new LinkedList <Integer>();
    Queue <Integer> odds = new LinkedList <Integer>();

    while (!myQ.isEmpty()){
        int num = myQ.remove();
        if (num%2==0){
            evens.add(num);
        } else {
            odds.add(num);
        }//end if else
    }//end while
    while(!evens.isEmpty()){
        myQ.add(evens.remove());
    }//end while to add evens
    while(!odds.isEmpty()){
        myQ.add(odds.remove());
    }//end while to add odds    
    
    System.out.println("Sorted Queue:");
    System.out.println(myQ);
  } // end main
} // end class