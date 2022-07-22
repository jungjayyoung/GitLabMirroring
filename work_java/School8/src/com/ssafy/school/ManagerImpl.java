package com.ssafy.school;

import java.util.Arrays;

public class ManagerImpl {

	private Person[] pa;
	private int index;
	
	//2
	private static ManagerImpl instance = new ManagerImpl();
	//1
	private ManagerImpl(int size) {
		pa = new Person[size];
		index = 0;
	}
	private ManagerImpl() {
		this(10);
	}
	
	//3
	public static ManagerImpl getInstance() {
		return instance;
	}
	public static void setInstance(ManagerImpl instance) {
		ManagerImpl.instance = instance;
	}
	
	
	
	//------------------------------------
	
//	//2
//		private static ManagerImpl instance;
//		//1
//		private ManagerImpl(int size) {
//			pa = new Person[size];
//		}
//		private ManagerImpl() {
//			this(10);
//		}
//		
//		//3
//		public static ManagerImpl getInstance() {
//			if(instance == null) instance = new ManagerImpl();
//			return instance;
//		}
	
	
	public void add(Person p) {
		pa[index++] = p;
	}
	
	public Person[] search() {
		return Arrays.copyOf(pa, index);
	}
	
	public Person search(String name) {
		for(int i=0; i < index;i++) { //pa.length를 하게 되면 NullPointerException 이 터진다.
			String nm = pa[i].getName();
			if(nm.equals(name)) return pa[i];
		}
		return null;
	}
	
	public void update(Person p) {
		for(int i=0; i < index;i++) { //pa.length를 하게 되면 NullPointerException 이 터진다.
			
			if(pa[i].getName().equals(p.getName())) {
				pa[i] =p;
				return;
			}
		}
	}
	
	public void delete(String name) {
		for(int i=0; i < index;i++) { //pa.length를 하게 되면 NullPointerException 이 터진다.
			
			if(pa[i].getName().equals(name)) {
				
				pa[i] = pa[--index];
				return;
			}
		}
	}
	
	public void printAll() {
		for(int i = 0; i<index;i++) {
			pa[i].printAll();
		}
	}
	
}
