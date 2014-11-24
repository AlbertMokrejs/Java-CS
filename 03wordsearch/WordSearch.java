import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordGrid{
    private char[][] data;

    public WordGrid(int row, int col){
	data = new char[row][col];
	clear();
    }
    
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
	     if((data[row+(x*a)][col+(x*b)] == ' ' || (data[row+(x*a)][col+(x*b)] == w.charAt(x)))){
		 data[row+(x*a)][col+(x*b)] = w.charAt(x);}
	     else{
		 return false;}}
	 return true;}


    public static void main(String args[]) throws FileNotFoundException {
        File text = new File("C:/temp/test.txt");
        //	requires a file input string that works
        Scanner scnr = new Scanner(text);
        WordGrid a = new Wordgrid(20,20);
        a.clear();
        Random r = new Random();
	ArrayList<String> word = new ArrayList<String>();
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            word.add(line);
        }
        while(ArrayList.size() > 0){
        	for(int x = 0; x < 5; x++;){
        		if(addZ(word.get(0),(int)(r.nextDouble()*Rrow()),(int)(r.nextDouble()*Rcol()),(int)((r.nextDouble()*2)-0.5),(int)((r.nextDouble()*2)-0.5))){
        			x = 5;
        		}}
        		word.remove(0);}
      	System.out.println(a);
    }}
