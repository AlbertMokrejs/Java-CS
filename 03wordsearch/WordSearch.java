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

     public boolean addH(String w, int row, int col){
	 if((row > data.length) || (col > data[0].length) ||(col + w.length() > data[0].length)){
	     return false;}
	 for(int x = 0; x < w.length(); x++){
	     if((data[row][col+x] == ' ' || (data[row][col+x] == w.charAt(x)))){
		 data[row][col+x] = w.charAt(x);}
	     else{
		 return false;}}
	 return true;}

    public boolean addV(String w, int row, int col){
	return addH(w, col, row);}

    public boolean addD(String w, int row, int col){
	if((row > data.length) || (col > data[0].length) ||(col + w.length() > data[0].length)||(row + w.length() > data.length)){
	     return false;}
	 for(int x = 0; x < w.length(); x++){
	     if((data[row+x][col+x] == ' ' || (data[row+x][col+x] == w.charAt(x)))){
		 data[row+x][col+x] = w.charAt(x);}
	     else{
		 return false;}}
	 return true;}

    public static void main(String[]args){
	WordGrid a = new WordGrid(10,10);
	a.clear();
	System.out.println(a);
	a.addH("glub",0,0);
	a.addV("land",1,0);
	a.addH("lard",0,1);
	System.out.println(a);}}
