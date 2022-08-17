package boj;

import java.util.*;
import java.io.*;

public class p10825 {
	
	static class Student implements Comparable<Student>{
		
		String name;
		int kor;
		int eng;
		int mat;
		
		public Student(){}
		
		public Student(String name,int kor,int eng,int mat) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
		@Override
		public int compareTo(Student o) {
			if(kor != o.kor) {
				return -(kor - o.kor);
			}else if(eng != o.eng) {
				return eng - o.eng;
			}else if(mat != o.mat) {
				return -(mat - o.mat);
			}else
				return name.compareTo(o.name);
		}
		
	}
	
	static Student[] students;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		students = new Student[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			String a = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			students[i] = new Student(a,b,c,d);
		}
		
		Arrays.sort(students);
		
		for(int i = 0; i <n; i++) {
			System.out.println(students[i].name);
		}
		
		
		
	}

}
