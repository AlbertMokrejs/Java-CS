public class SuperArray{
    public int Z;
    public Object[] Ray = null;
    
    public SuperArray(){
	Ray = new Object[10];
	Z = 0;}

    public SuperArray(int x){
	Ray = new Object[x];
	Z = 0;}

    public String toString(){
        sort();
	String z = "[ ";
	for(int x = 0; x < Z; x++){
	    z+= Ray[x] + " ";}
	return z + "]";}

    public void add(Object x){
        sort();
	if(Z < Ray.length){
	    Ray[Z] = x;
	    Z++;}
	else{
	    resize(Ray.length + 5);
	    Z = size();
	    Ray[Z] = x;
	    Z++;
	}}
    
    public void add(Object x, int y){
        sort();
    if(Z < Ray.length){
	    for(int z = size(); z > y; z--){
         Ray[z] = Ray[z-1];}
         Ray[y] = x;
	    }
	else{
	    resize(Ray.length + 5);
	    add(x,y);
	}}

    public void resize(int x){
        sort();
	if(x > Ray.length){
	    Object[] TMP = new Object[x];
	    for(int y = 0; y < Z; y++){
		TMP[y] = Ray[y];}
	    Ray = TMP;}
	else{ if(x < Ray.length){
		Object[] TMP = new Object[x];
		for(int y = 0; y < x; y++){
		    TMP[y] = Ray[y];}
		Ray = TMP;}}
    }
    
    public void swap(int x, int y){
        sort();
        Object TMP = Ray[x];
        Ray[x] = Ray[y];
        Ray[y] = TMP;
    }

    public int size(){
        sort();
	int x = 0;
	for(int y = 0; y < Ray.length; y++){
	    if (Ray[y] == null){
		x++;}
	}
	Z =  Ray.length - x;
	return  Ray.length - x;}

    public void clear(){
	for(int y = 0; y < Ray.length; y++){
	    Ray[y] = null;}
	Z = 0;
    }
    
    public Object get(int x){
        sort();
	if((x < 0) || (x >= size()){
        throw new  IndexOutOfBoundsException(); 
	}
	else{
	    return Ray[x];}}
    
    public object set(int x, Object e){
       	if((x < 0) || (x > size()-1){
            sort();
            throw new  IndexOutOfBoundsException();
       	}
	else{
        Object TMP = Ray[x];
	    Ray[x] = e;
	    size();
        sort();
        return TMP;}}

    public void sort(){
        for(int x = 0; x < Ray.length; x++){
            if((Ray[x] == null) && (Ray[x+1] != null)){
                Ray[x] = Ray[x+1];
                x = 0;}
            }
    }
    
    public Object remove(int x){
        sort();
        TMP = set(x, null);
        sort();
        return TMP;
    }

    public static void main(String[]args){
	Integer x = new Integer(5);
	SuperArray L = new SuperArray();
	L.add(x);
	L.add(new Integer(99));
	System.out.println(L);
	L.clear();
	System.out.println(L);
	L.resize(15);
	System.out.println(L);
	L.get(1);
	L.set(1, new Integer(5));
	System.out.println(L);
	System.out.println(L.get(1));}}
