import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Driver{
    public static WordGrid a;


    public static void main(String[] args) throws FileNotFoundException{
	if (args.length == 2){
	    a = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	    a.loadWordsFromFile("C:\\Users\\Albert Mokrejs\\Desktop\\xxa\\words.txt",false);}
	else{
	if (args.length > 2){
	    if((args.length > 3) && (Integer.parseInt(args[3]) == 1)){
		a = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		a.loadWordsFromFile("C:\\Users\\Albert Mokrejs\\Desktop\\xxa\\words.txt",true);}
	    else{
		a = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		a.loadWordsFromFile("C:\\Users\\Albert Mokrejs\\Desktop\\xxa\\words.txt",false);}}
	else{
	    a = new WordGrid(50,50);
	    a.loadWordsFromFile("C:\\Users\\Albert Mokrejs\\Desktop\\xxa\\words.txt",false);}}
	System.out.println(a.wordsInPuzzle());
    System.out.println(a);}}
    
    //I hate this file. Kill it with fire.
