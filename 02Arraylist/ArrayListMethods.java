import java.util.*;

public class ArrayListMethods{
    public static void collapseDuplicates(ArrayList<Integer> L){
	for(int x = 0; x + 1 < L.size() ; x++){
		if(L.get(x) == L.get(x+1)){
			L.remove(x);
			x = 0;}
	}}
	   
    public static void Swap(ArrayList<Integer> L, int a, int b){
            Integer TMP = L.get(a); //Better to use data than to use rempve
            L.set(a,L.get(b));
            L.set(b,TMP);
    }
    
    public static void randomize(ArrayList<Integer> L){
        Random r = new Random();
        for(int x = 0; x < L.size() * 2; x++){
            Swap(L,(int)(L.size() * r.nextDouble()),(int)(L.size()* r.nextDouble()));
        }
    }
    
    public static void main(String[]args){
        ArrayList<Integer> L = new ArrayList<Integer>();
        for(int x = 0; x < 22; x++){
            L.add(x);
            L.add(x);
        }
        randomize(L);
        collapseDuplicates(L);
        System.out.println(L);
    }}
