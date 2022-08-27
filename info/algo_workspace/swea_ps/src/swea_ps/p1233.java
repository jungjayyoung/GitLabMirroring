package swea_ps;
import java.util.*;
import java.io.*;

public class p1233 {
	static int n;
	static class Node{
		
		String data;
		int left;
		int right;
		
		Node(String data){
			this.data = data;
			left = 0;
			right = 0;
		}
		
	
	}
	
	static Node[] nodes;

	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		for(int t = 1; t <= 10; t++) {
			n = Integer.parseInt(br.readLine());
			boolean check = false;
			
			nodes = new Node[n + 1];
			
			
			for(int i = 0; i <n; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int node_num = Integer.parseInt(st.nextToken());
				
				String data = st.nextToken();
				
				nodes[node_num] = new Node(data);
				
				
				
				if(st.hasMoreElements()) {
					int left_child = Integer.parseInt(st.nextToken());
					nodes[node_num].left = left_child;
					
				}
				
				if(st.hasMoreElements()) {
					int right_child =Integer.parseInt(st.nextToken());
					nodes[node_num].right = right_child;
						
				}
				
				if(data.equals("*") || data.equals("/") || data.equals("+") || data.equals("-")) {
					
					if(nodes[node_num].left == 0 && nodes[node_num].right == 0) {
						check = true;
					}
					
				}
				
				
			}
			
			for(int i = 1; i<=n; i++) {
				
				// 현재 노드가 숫자라면
				if(nodes[i].data.charAt(0) >= '0' && nodes[i].data.charAt(0) <= '9') {
					
					if(nodes[i].left != 0) {
						int idx = nodes[i].left;
						if(nodes[idx].data.charAt(0) >= '0' && nodes[idx].data.charAt(0) <= '9') {
							check = true;
						}
					}
					
					if(nodes[i].right != 0) {
						int idx = nodes[i].left;
						if(nodes[idx].data.charAt(0) >= '0' && nodes[idx].data.charAt(0) <= '9') {
							check = true;
						}
						
					}
					
				}
				
			}
			
			if(check) {
				System.out.println("#" + t + " " + "0");
			}else {
				System.out.println("#" + t + " " + "1");
			}
			
			
			
			
			
		}
		
		
		br.close();
		
		
	}

}