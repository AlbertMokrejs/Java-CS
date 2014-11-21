public class WordGrid{
    private char[][] data;

    public WordGrid(int row, int col){
	data = new char[row][col];
	clear();
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

     public boolean addR(String w, int row, int col){
	 return addZ(w, row, col, 0, 1);}
	 
	public boolean addL(String w, int row, int col){
	return addZ(w, row, col, 0, -1);}

    public boolean addD(String w, int row, int col){
	return addZ(w, row, col, 1,0);}
	
public boolean addU(String w, int row, int col){
	return addZ(w, row, col, -1,0);}

    public boolean addDR(String w, int row, int col){
	return addZ(w, row, col, 1, 1);}
	
	    public boolean addDL(String w, int row, int col){
	return addZ(w, row, col, 1, -1);}
	
		    public boolean addUR(String w, int row, int col){
	return addZ(w, row, col, -1, 1);}
	    
	    public boolean addUL(String w, int row, int col){
	return addZ(w, row, col, -1, -1);}
	 
    public boolean addZ(String w, int row, int col,int a, int b){
	if((row > data.length) || (col > data[0].length) ||((col + w.length()*b) > data[0].length)||(row + (a*w.length()) > data.length)||(row + (a*w.length()) <0)||(row - (a*w.length()) < 0)){
	     return false;}
	 for(int x = 0; x < w.length(); x++){
	     if((data[row+(x*a)][col+(x*b)] == ' ' || (data[row+(x*a)][col+(x*b)] == w.charAt(x)))){
		 data[row+(x*a)][col+(x*b)] = w.charAt(x);}
	     else{
		 return false;}}
	 return true;}


    public static void main(String[]args){
	WordGrid a = new WordGrid(10,10);
	a.clear();
	System.out.println(a);
	a.addR("glub",0,0);
	a.addDR("land",0,1);
	a.addD("lard",0,1);
	System.out.println(a);}}
