public class WordGrid{
    private Char[] data;

    public WordGrid(int row, int col){
	data = new Char[row * col];
	for(int x = 0; x < data.length; x++){
	    data[x] = " ";}
    }

    public void clear(){
	for(int x = 0; x < data.length; x++){
	    data[x] = " ";}}

}
