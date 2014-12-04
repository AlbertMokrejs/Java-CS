import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class SuperArray{
    public int Z;
    public String[]
 Ray = null;
    public int O;
    
    public SuperArray(){
    Ray = new String[10];
	Z = 0;}

    public SuperArray(int x){
	Ray = new String[x];
	Z = 0;}

    public String toString(){
        sort();
	String z = "[ ";
	for(int x = 0; x < Z; x++){
	    z+= Ray[x] + " ";}
	return z + "]";}

    public void add(String x){
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
    
    public void add(String x, int y){
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
	    String[] TMP = new String[x];
	    for(int y = 0; y < Z; y++){
		TMP[y] = Ray[y];}
	    Ray = TMP;}
	else{ if(x < Ray.length){
		String[] TMP = new String[x];
		for(int y = 0; y < x; y++){
		    TMP[y] = Ray[y];}
		Ray = TMP;}}
    }
    
    public void swap(int x, int y){
        sort();
        String TMP = Ray[x];
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
    
    public String get(int x){
        sort();
	if((x < 0) || (x >= size())){
        throw new  IndexOutOfBoundsException(); 
	}
	else{
	    return Ray[x];}}
    
    public String set(int x, String e){
       	if((x < 0) || (x > size()-1)){
            sort();
            throw new  IndexOutOfBoundsException();
       	}
	else{
        String TMP = Ray[x];
	    Ray[x] = e;
	    size();
        sort();
        return TMP;}}

    public void sort(){
        for(int x = 0; x < Ray.length - 1; x++){
            if((Ray[x] == null) && (Ray[x+1] != null)){
                Ray[x] = Ray[x+1];
                x = 0;}
            }
    }
    
    public String remove(int x){
        sort();
        String TMP = set(x, null);
        sort();
        return TMP;
    }

  


    public void insertionSort() { /*Courtesy of Nathan Mannes because my version had 3 for loops, and didn't work... even after multiple attempts to re-write
				   old version is on old commit in github. RIP.*/
	for (int x=0; x < size();x++) {
	    String TMP = get(x);
	    int a = x;
	    while (a > 0 && TMP.compareTo(get(a-1))<0) {
		set(a,(get(a-1)));
		a--;
	    }
	    set(a,TMP);
	}
    }

    public int find(String a){
	for(int x = 0; x < size(); x++){
	    if(get(x) == a){
		return x;}
	}
	return -1;}
 
	

			

    public static void main(String[]args){
	SuperArray a = new SuperArray(10);
	Random r = new Random();
	a.add("a");
	a.add("yo");
	a.add("bing");
	a.add("greg");
	a.add("cent");
	System.out.println(a.find("cent"));
	


    }}
