public class sorts{
    
    public static void bubble(int[]c){
	int P = 0;
	for(int x = 0; x < c.length - 1; x++){
	    P = 0;
	    for(int y = 0; y < c.length - (x+1);y++){
		if(c[y] > c[y+1]){
		    int TMP = c[y];
		    c[y] = c[y+1];
		    c[y+1] = TMP;
		    P++;}}
	    if(P == 0){
		x = c.length}}}

    public static void insertion(int[]c){
	for(int x = 1; x < c.length - 1; x++){
	    for(int y = x; y > 0; y--){
		if(c[y] < c[y-1]){
		    int TMP = c[y];
		    c[y] = c[y+1];
		    c[y+1] = TMP;}
		else{
		    y = 0;}}}}

    public static void selection(int[]c){
	
