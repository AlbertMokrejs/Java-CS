import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class WordGrid{
    private char[][] data;
    private File text;
    private ArrayList<String> word;
    private ArrayList<String> saved;
    private Scanner scnr;
    private Random r;


    public WordGrid(int row, int col) throws FileNotFoundException{
	data = new char[row][col];
	clear();
        r = new Random();
	saved = new ArrayList<String>();
	word = new ArrayList<String>();
	
    }

    public WordGrid(int row, int col, int seed) throws FileNotFoundException{
	data = new char[row][col];
	clear();
        r = new Random(seed);
	saved = new ArrayList<String>();
	word = new ArrayList<String>();
    }

    public String wordsInPuzzle(){
	String out = "";
	while(saved.size() > 0){
	    out += saved.remove(0) + " ";}
	return out;}
	    

    public void loadWordsFromFile(String a, boolean b) throws FileNotFoundException{
	  text = new File("C:\\Users\\Albert Mokrejs\\Desktop\\xxa\\words.txt");
	  scnr = new Scanner(text);
	   while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            word.add(line);
		 }
	   addLoop();
	   if(! b){
	        for(int x = 0; x < data.length; x++){
		    for(int y = 0; y < data[0].length; y++){
			if (data[x][y] == ' '){
			    data[x][y] = (char)('a' + Math.random() * ('z' - 'a'));}}}}}
	       
	
    
    public int Rrow(){
    	return data.length;
    }
    public int Rcol(){
    	return data[0].length;
    }

    public void clear(){
	    for(int x = 0; x < data.length; x++){
	    for(int y = 0; y < data[0].length; y++){
		data[x][y] = ' ';}}}

	public String toString(){
		String str = "";
		for(int x = 0; x < data.length; x++){
	    for(int y = 0; y < data[0].length; y++){
		str += data[x][y] + " ";}}
		return str;}
	 
    public boolean addZ(String w, int row, int col,int a, int b){
	if((row > data.length) || (col > data[0].length) ||((col + w.length()*b) > data[0].length)||(row + (a*w.length()) > data.length)||(row + (a*w.length()) <0)||(row - (a*w.length()) < 0)){
	     return false;}
	for(int x = 0; x < w.length(); x++){
	     if((data[row+(x*a)][col+(x*b)] == ' ' || (data[row+(x*a)][col+(x*b)] == w.charAt(x)))){}
	     else{
		 return false;}}
	 for(int x = 0; x < w.length(); x++){
	     if((data[row+(x*a)][col+(x*b)] == ' ' || (data[row+(x*a)][col+(x*b)] == w.charAt(x)))){
		 data[row+(x*a)][col+(x*b)] = w.charAt(x);}
	     else{
		 return false;}}
	 return true;}

    public void addLoop(){
	 while(word.size() > 0){
        	for(int x = 0; x < 5; x++){
        		if(addZ(word.get(0),(int)(r.nextDouble()*Rrow()),(int)(r.nextDouble()*Rcol()),(int)((r.nextDouble()*2)-0.5),(int)((r.nextDouble()*2)-0.5))){
        			x = 5;
				saved.add(word.get(0));
			}}
		word.remove(0);}}

}
