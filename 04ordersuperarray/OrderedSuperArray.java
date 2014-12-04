public class OrderedSuperArray extends SuperArray{

    

public void add (String a){
	int x = size();
	sort();
	while((x > 0) && (get(x-1).compareTo(a) > 0)){
	    x--;
	}
	size();
	super.add(a,x);
} /*Courtesy of Nathan Mannes, I had trouble getting this working because I kept overcomplicating it.*/
    
    public void add(String x, int y){
	add(x);}

   
    public String set(int x, String e){
       	if((x < 0) || (x > size())){
            sort();
            throw new  IndexOutOfBoundsException();
       	}
	else{
	    String str = remove(x);
	    add(e);
	    return str;}}

    public int find(String a){
	boolean nfound = true;
	int x = (int)(size() / 2);
	int counter = 0;
	while(nfound && (counter < 1000)){
	    counter++;
	    if(get(x).compareTo(a)  == 0){
		for(int z = x; z > 0; z--){
		    if(get(z-1).compareTo(get(z)) != 0){
			return z;}}}
	    if(get(x).compareTo(a) < 0){
		if(x == (int)((x + size())/2)){
		    return -1;}
		x = (int)((x + size())/2);}
	    else{
 		if(x ==(int)(x/2)){
		    return -1;}
		x = (int)(x/2);}}
	return super.find(a);}/* you should never need that counter */

    public static void main(String[] args){
	OrderedSuperArray a = new OrderedSuperArray();
	a.add("a");
	a.add("x");
	a.add("glub");
	a.add("data");
	a.add("zeta");
	a.add("five");
	a.add("zeta");
	a.add("hi");
	a.add("hi");a.add("hi");
	a.add("hi");a.add("hi");
	a.add("hi");
	System.out.println(a);
	System.out.println(a.find("five"));}




}
