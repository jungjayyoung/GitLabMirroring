package swea_ps;

import java.io.*;
import java.util.*;

public class p5644_무선충전 {
	static int m, a;
	static int dx[] = {0,0,1,0,-1};
	static int dy[] = {0,-1,0,1, 0};
	static int a_move[];
	static int b_move[];
	static int board[][];
	static List<int[]> charger;
	static List<Integer>[][] charger_list;
	static boolean visited[][];
	static int lim;
	
	static void dfs(int x, int y, int cnt,int idx) {
		
		if(cnt >= lim) {
			
			return;
		}
		
		visited[y][x] = true;
		charger_list[y][x].add(idx);
		
		
		for(int i = 1; i<=4; i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			
			if(nextx > 10 || nexty > 10 || nextx <1 || nexty < 1) continue;
			
			if(!visited[nexty][nextx]) {
				dfs(nextx,nexty,cnt+1,idx);
			}
			
			
		}
		
		
	}
	
	
	

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <=tc; t++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			m = Integer.parseInt(st.nextToken());
			a = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine()," ");
			
			a_move = new int[20];
			b_move = new int[20];
			for(int i=0; i <m;i++) {
				a_move[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine()," ");
			for(int i=0; i <m;i++) {
				b_move[i] = Integer.parseInt(st.nextToken());
			}
			
			
			board = new int[11][11];
			charger = new ArrayList<int[]>();
			
			for(List<Integer> a[] : charger_list) {
				
				for(List<Integer> b : a) {
					b = new ArrayList<>();
				}
			}
			
			
			for(int i = 0; i < a; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int dist = Integer.parseInt(st.nextToken());
				int power = Integer.parseInt(st.nextToken());
				
				charger.add(new int[] {x,y,dist,power});
				
				lim = dist;
				
				visited = new boolean[11][11];
				
				dfs(x,y,0,i);
			}
			
			
			
			Collections.sort(charger, (o1, o2)->{
				int r = Integer.compare(o1[3], o2[3]);
				if(r == 0) r = Integer.compare(o1[2], o2[2]);
				return r;
			});
			
			int ax = 1;
			int ay = 1;
			int bx = 10;
			int by = 10;
			int a_sum = 0;
			int b_sum = 0;
			
			
			for(int ii = 0; ii < m; ii++) {
				
				List<int[]> a = new ArrayList<int[]>();
				for(int i = 0; i< charger_list[ay][ax].size();i++) {
					int charger_idx = charger_list[ay][ax].get(i);
					int aa[] = charger.get(charger_idx);
					int power = aa[3];
					
					a.add(new int[]{charger_list[ay][ax].get(i),power});
				}
				List<int[]> b = new ArrayList<int[]>();
				for(int i = 0; i <charger_list[by][bx].size(); i++) {
					int charger_idx = charger_list[by][bx].get(i);
					int aa[] = charger.get(charger_idx);
					int power = aa[3];
					b.add(new int[]{charger_list[by][bx].get(i),power});
				}
				Collections.sort(a, (o1,o2) ->{
					return -Integer.compare(o1[1], o2[1]);
				});
				Collections.sort(b, (o1,o2) ->{
					return -Integer.compare(o1[1], o2[1]);
				});
				
				
				//if()
				
				
				// 중복인 발전소 체크
				for(int i = 0; i < a.size(); i++) {
					
					for(int j = 0; j < b.size(); j++) {
						
					}
				}
				
				ax = ax + dx[a_move[ii]];
				ay = ay + dy[a_move[ii]];
				bx = bx + dx[b_move[ii]];
				by = by + dy[b_move[ii]];
				
				
				
			}
			
			
			
		}
		
	}

}
