package assignment_1;
import java.util.List;

import java.util.ArrayList;

import java.util.Collection;

import java.io.*;

import java.util.LinkedList;

import java.util.Iterator;







public class LinkList {



public static void main(String [] args)

{

List li = new LinkedList<>();

li.add("Saurabh");

li.add("Babu");

li.add(4);
li.add(4);


Iterator i = li.iterator();

while(i.hasNext())

{

System.out.println(i.next());

}


}






}