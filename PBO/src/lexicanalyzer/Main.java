/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicanalyzer;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Aulia
 */
public class Main {

    
    public static void main(String[] args) {
        String str;
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        int tempTop = -1;
        int stackTop = -1;
        
        Scanner sc = new Scanner(System.in);
        
        // TAHAP 1 //
        
        //INPUT - OUTPUT
        System.out.print("Input : ");
        str = sc.nextLine();
        char[] charArray = str.toCharArray();
        
        System.out.print("Output : ");
        
        int i = 0;
        while (i <= (charArray.length)-1){
            //PQRS
            if (charArray[i] == 'p' || charArray[i] == 'q' || charArray[i] == 'r' || charArray[i] == 's') {
                System.out.print("1 | ");
                if (i == (charArray.length-1)) {
                    temp.push(1);
                    tempTop++;
                    break;
                }
                else if (charArray[i+1] == '('){
                    System.out.print("9 | ");
                    i++;
                    temp.push(1);
                    temp.push(9);
                    tempTop = tempTop + 2;
                }
                else if (charArray[i+1] == ')'){
                    System.out.print("10 | ");
                    i++;
                    temp.push(1);
                    temp.push(10);
                    tempTop = tempTop + 2;
                }
                else if (charArray[i+1] == ' '){
                    i++;
                    temp.push(1);
                    tempTop++;
                }
                else{
                    System.out.print("error");
                    temp.push(-1);
                    tempTop++;
                    break;
                }
            }
            
            //NOT
            else if (charArray[i] == 'n'){
                if (charArray[i+1] == 'o'){
                    if (charArray[i+2] == 't'){
                        System.out.print("2 | ");
                        if (charArray[i+3] == '('){
                            i = i + 2;
                            temp.push(2);
                            tempTop++;
                        }
                        else if (charArray[i+3] == ' '){
                            i = i + 3;
                            temp.push(2);
                            tempTop++;
                        }
                        else {
                            System.out.print("error");
                            temp.push(-1);
                            tempTop++;
                            break;
                        }
                    }
                    else{
                        System.out.print("error");
                        temp.push(-1);
                        tempTop++;
                        break;
                    }
                }
                else{
                    System.out.print("error");
                    temp.push(-1);
                    tempTop++;
                    break;
                }
            }
            
            //AND
            else if (charArray[i] == 'a'){
                if (charArray[i+1] == 'n'){
                    if (charArray[i+2] == 'd'){
                        if (charArray[i+3] == '('){
                            i = i + 2;
                            System.out.print("3 | ");
                            temp.push(3);
                            tempTop++;
                        }
                        else if (charArray[i+3] == ' ') {
                            i = i +3;
                            System.out.print("3 | ");
                            temp.push(3);
                            tempTop++;
                        }
                        else {
                            System.out.print("error");
                            temp.push(-1);
                            tempTop++;
                            break;
                        }
                    }
                    else{
                        System.out.print("error");
                        temp.push(-1);
                        tempTop++;
                        break;
                    }
                }
                else{
                    System.out.print("error");
                    temp.push(-1);
                    tempTop++;
                    break;
                }
            }
            
            //OR
            else if (charArray[i] == 'o'){
                if (charArray[i+1] == 'r'){
                    if (charArray[i+2] == '(') {
                        i++;
                        System.out.print("4 | ");
                        temp.push(4);
                        tempTop++;
                    }
                    else if (charArray[i+2] == ' ') {
                        System.out.print("4 | ");
                        i = i + 2;
                        temp.push(4);
                        tempTop++;
                    }
                    else {
                        System.out.print("error");
                        temp.push(-1);
                        tempTop++;
                        break;
                    }
                }
                else{
                    System.out.print("error");
                    temp.push(-1);
                    tempTop++;
                    break;
                }
            }
            
            //XOR
            else if (charArray[i] == 'x'){
                if (charArray[i+1] == 'o'){
                    if (charArray[i+2] == 'r'){
                        if (charArray[i+3] == '(') {
                            System.out.print("5 | ");
                            i = i + 2;
                            temp.push(5);
                            tempTop++;
                        }
                        else if (charArray[i+3] == ' ') {
                            System.out.print("5 | ");
                            i = i + 3;
                            temp.push(5);
                            tempTop++;
                        }
                        else {
                            System.out.print("error");
                            temp.push(-1);
                            tempTop++;
                            break;
                        }
                    }
                    else{
                        System.out.print("error");
                        temp.push(-1);
                        tempTop++;
                        break;
                    }
                }
                else{
                    System.out.print("error");
                    temp.push(-1);
                    tempTop++;
                    break;
                }
            }
            
            //IF & IFF
            else if (charArray[i] == 'i'){
                if (charArray[i+1] == 'f'){
                    if (charArray[i+2] == 'f'){
                        if (charArray[i+3] == '('){
                            i = i + 2;
                            System.out.print("8 | ");
                            temp.push(8);
                            tempTop++;
                        }
                        else if (charArray[i+3] == ' ') {
                            System.out.print("8 | ");
                            i = i + 3;
                            temp.push(8);
                            tempTop++;
                        }
                        else {
                            System.out.print("error");
                            temp.push(-1);
                            tempTop++;
                            break;
                        }
                    }
                    else if (charArray[i+2] == ' ') {
                        temp.push(6);
                        tempTop++;
                        System.out.print("6 | ");
                        i = i + 2;
                    }
                    else if (charArray[i+2] == '(') {
                        temp.push(6);
                        tempTop++;
                        System.out.print("6 | ");
                        i++;
                    }
                    else{
                        System.out.print("error");
                        temp.push(-1);
                        tempTop++;
                        break;
                    }
                }
                else{
                    System.out.print("error");
                    temp.push(-1);
                    tempTop++;
                    break;
                }
            }
            
            //THEN
            else if (charArray[i] == 't'){
                if (charArray[i+1] == 'h'){
                    if (charArray[i+2] == 'e'){
                        if (charArray[i+3] == 'n'){
                            if (charArray[i+4] == '(') {
                                System.out.print("7 | ");
                                i = i + 3;
                                temp.push(7);
                                tempTop++;
                            }
                            else if (charArray[i+4] == ' ') {
                                System.out.print("7 | ");
                                i = i + 4;
                                temp.push(7);
                                tempTop++;
                            }
                            else {
                                System.out.print("error");
                                temp.push(-1);
                                tempTop++;
                                break;
                            }
                        }
                        else{
                            System.out.print("error");
                            temp.push(-1);
                            tempTop++;
                            break;
                        }
                    }
                    else{
                        System.out.print("error");
                        temp.push(-1);
                        tempTop++;
                        break;
                    }
                }
                else{
                    System.out.print("error");
                    temp.push(-1);
                    tempTop++;
                    break;
                }
            }
            
            // (
            else if (charArray[i] == '('){
                temp.push(9);
                tempTop++;
                System.out.print("9 | ");
            }
            
            // )
            else if (charArray[i] == ')'){
                temp.push(10);
                tempTop++;
                System.out.print("10 | ");
            }
            
            else{
                System.out.print("error");
                temp.push(-1);
                tempTop++;
                break;
            }
            
            i++;
        }
        System.out.println();
        System.out.print("VALID CHECK : ");
        
        // TAHAP 2 //
        
        //REVERSE STACK
        while (tempTop >= 0) {
            stack.push(temp.get(tempTop));
            stackTop++;
            tempTop--;
        }
        
        //VALID CHECK
        while (stackTop >= 0) {
            //NOT, AND, OR, XOR, IFF
            if (stack.get(stackTop) == 2 || stack.get(stackTop) == 3 || stack.get(stackTop) == 4 || stack.get(stackTop) == 5 || stack.get(stackTop) == 8) {
                if (stack.get(stackTop-1) == 1 || stack.get(stackTop-1) == 9 ) {
                    stackTop--;
                    stack.pop();
                    System.out.println("VALID");
                }
                else {
                    System.out.print("TIDAK VALID");
                    break;
                }
            }
            
            //IF THEN
            else if (stack.get(stackTop) == 6) {
                if (stack.get(stackTop-1) == 1) {
                    if (stack.get(stackTop-2) == 7) {
                        if (stack.get(stackTop-3) == 1) {
                            stackTop = stackTop - 3;
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            System.out.println("VALID");
                            
                 
                        }
                        else if (stack.get(stackTop-3) == 9) {
                            stackTop = stackTop - 3;
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            System.out.println("VALID");
                        }
                        else {
                            System.out.print("TIDAK VALID");
                            break;
                        }
               
                    }
                    else {
                        System.out.print("TIDAK VALID");
                        break;
                    }
                }
                else if (stack.get(stackTop-1) == 9) {
                    stackTop--;
                    stack.pop();
                    System.out.println("VALID");
                }
                else {
                    System.out.print("TIDAK VALID");
                    break;
                }
            }
            
            //P, Q, R, S
            else if (stack.get(stackTop) == 1) {
                if (stackTop == 0) {}
                else if (stack.get(stackTop-1) == 10) {
                    stackTop--;
                    stack.pop();
                }
                else {
                    System.out.print("TIDAK VALID");
                    break;
                }
            }
            
            // (
            else if (stack.get(stackTop) == 9) {
                if (stack.get(stackTop-1) == 1){
                    stackTop--;
                    stack.pop();
                }
                else {
                    System.out.print("TIDAK VALID");
                    break;
                }
            }
            
            // )
            else if (stack.get(stackTop) == 10) {
                if (stackTop == 0){}
                else {
                    System.out.print("TIDAK VALID");
                    break;
                }
            }
            
            //CEK JUMLAH ()
            
        }
        
        if (stackTop == 0) {
            System.out.print("VALID");
        }
    }
    
}
