import java.io.*;
import java.util.*;

public class sorts{
    
    public static String name(){
	return "Mokrejs,Albert";}
    
    public static int period(){
	return 7;}


    public static void bubble(int[]c){
	int P = 0;
	int TMP = null;
	for(int x = 0; x < c.length - 1; x++){
	    P = 0;
	    for(int y = 0; y < c.length - (x+1);y++){
		if(c[y] > c[y+1]){
		    TMP = c[y];
		    c[y] = c[y+1];
		    c[y+1] = TMP;
		    P++;}}
	    if(P == 0){
		x = c.length}}}

    public static void insertion(int[]c){
	int TMP = null;
	for(int x = 1; x < c.length - 1; x++){
	    for(int y = x; y > 0; y--){
		if(c[y]<c[y-1]){
		    TMP = c[y];
		    c[y] = c[y+1];
		    c[y+1] = TMP;}
		else{
		    y = 0;}}}}

    public static void selection(int[]c){
	for (int x = 0;x<list.length;x++){
	    int CLONE;
	    int TMP;
	    CLONE = c[x];
	    for (int y = x+1;y<c.length;y++){
		if (CLONE<c[y]){
		    TMP = CLONE;
		    CLONE = c[y];
		    list[y] = TMP;}}
	    c[x] = CLONE;
	}}

    public static void radix(int[]c){
	int L = 0;
	Arraylist<Arraylist<Integer>> AList = new Arraylist<Arraylist<Integer>>(10);
	for(int x = 0; x < c.length; x++){
	    if(String.valueOf(c[x]).length() > L){
		L = String.valueOf(c[x]).length();}}
	for(int y = 0; y < L; y++){
	    for(int z = 0; z < c.length; z++){
		AList.get(c[z] % (10 ** y+1)).add(c[z])

}
