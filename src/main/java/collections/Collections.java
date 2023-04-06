package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections {

	public static void main(String args[]) {
		
			
			ArrayList al= new ArrayList();
					
			//addAll()		-- with this we can add whole collection in another collection
			//add() 		--is a method to add data in collection object
			//remove()		-- to remove or delete data from collection
			//get()			--retrive data from collection
			
			al.add(111);
			al.add("test");
			al.add(true);
			al.add('a');
			al.add(null);
			al.add(null);
			
			System.out.println(al);
			System.out.println(al.get(4));	//it will print data on given index no.
			System.err.println("----------------------------------------------------------------------------");

			HashSet h1= new HashSet();		//It doesn't allow duplication
			h1.add(111);
			h1.add("test");
			h1.add(true);
			h1.add('a');
			h1.add(null);
			h1.add(null);
			System.out.println(h1);			//it prints randomly
			//System.out.println(h1.get(4));	//it will show error because it doesnt support indexing
			
			System.err.println("--------------------------------------HashSet--------------------------------");
			HashSet h2= new HashSet();
			h2.add(al);
			System.out.println(h2);			//Adding one collection into another
			
			System.err.println("----------------another way to adding collection into another------------------");
			HashSet hs1= new HashSet(al);
			System.out.println(hs1);				//Copy nai hora hai
			
			System.err.println("------------------LinkedSet-----------------------------");
			 
			LinkedHashSet linkedHS= new LinkedHashSet();
			linkedHS.add(111);
			linkedHS.add("test");
			linkedHS.add(true);
			linkedHS.add('a');
			linkedHS.add(111);
			linkedHS.add(null);
			linkedHS.add(null);
			linkedHS.add(null);
			System.out.println(linkedHS);
			
			HashSet hs2= new HashSet();
			hs2.add("aa");
			hs2.add("cc");
			hs2.add("bb");
			hs2.add("abc");
			System.out.println(hs2);
			System.out.println("-------------------------TreeSet------------------------");
			TreeSet ts= new TreeSet();
			ts.add(11);
			ts.add(33);
			ts.add(22);
			ts.add(10);
			ts.add(11);
			System.out.println(ts);
			
			ArrayList al2= new ArrayList();
			al2.add(ts);
			System.out.println(al2.get(2));		//it is showing error
		}

		

	}


