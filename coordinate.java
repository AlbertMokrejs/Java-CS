public class coordinate{
    int cordX;
    int cordY;
    String output;
	

    public void coordinate(){
	cordX = 0;
	cordY = 0;
	output = "";}

    public void setxy(int x,int y){
	cordX = x;
	cordY = y;
	output = "";}

    public void setx(int x){
	cordX = x;}

    public void sety(int y){
	cordY = y;}

    public String toString(){
	output = "";
	String output = "(" + cordX + "," + cordY + ")";
	return output;}}
	

    