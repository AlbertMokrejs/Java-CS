public class WordGrid{
    private Char[] data;
    private int r;
    private int c;

    public WordGrid(int row, int col){
	data = new Char[row * col];
	for(int x = 0; x < data.length; x++){
	    data[x] = " ";}
	    r = row;
	    c = col;
    }

    public void clear(){
	for(int x = 0; x < data.length; x++){
	    data[x] = " ";}}

	public String toString(){
		String str = "";
		for(int y = 0; y < r; y++){
			for(int x = 0; x < data.length()/r; x++){
				str = "";
				str += data[x] + " ";
			}
		str += "/n";
		}
		return str;
	}
	
     public boolean addH(String w, int row, int col){
     	if((row >= r) || (col + w.length() >= c + 1)){
     		return false;}
     	for(int x = 0; x < w.length(); x++){
     		if((data[c*row + col + x] == w.charAt(x)) || (data[c*row + col + x] == (Char)" ")){
     			data[c*row + col + x] = w.charAt(x);}
     		else:
     			return false;
     		}
     		return true;
     	}
     	
     	}
     }
