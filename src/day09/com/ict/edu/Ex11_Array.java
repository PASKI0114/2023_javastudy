package day09.com.ict.edu;

public class Ex11_Array {
	public static void main(String[] args) {
		//p1 번호 국어 영어 수학 총점 평균 학점=char 순위
		//p2 =>
		int[][] arr = new int [5][5];
		//int i = 0;
		       //번호,총점,평균,학점,순위
		int[] p1= {1,270,90,'A',1};
		int[] p2= {2,210,70,'C',1};
		int[] p3= {3,180,60,'F',1};
		int[] p4= {4,300,100,'A',1};
		int[] p5= {5,280,95,'A',1};
		int[] rank = {1,1,1,1,1}; //순위
				
		//1.총점을 구하자. ㅇ
		//2.총점을 비교하자.ㅇ 
		//3.총점으로 순위를 구하자.ㅇ
		//4.순위를 p에 넣자. ???? 뒤는모름
		
		
		
		
		
		//총점을 구하자. //해석 1차원 배열을 다차원 배열을 넣자.
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		System.out.println("arr:" + arr[0]);
		System.out.println("arr:" + arr[0][1]);
		
		//순위를 구하자 (arr)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][1] == arr[j][1]) continue;
				if(arr[i][1] < arr[j][1]) {
					rank[i]++; //이걸 arr[i][4]로썼다면? //안나오네..
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i]+"등");
		} 
		System.out.println();		
		
		//랭크의 값
		//arr[0][4] = rank[0];
		
		/*/내림차순으로 정렬
		int tmp = 0;
				
		for(int i=0; i<rank.length; i++) {
			for(int j=i+1; j<rank.length; j++) {
				if(rank[j] < rank[i]) {
					tmp = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp;
				}
			}
		}
		*/
		/*/오름차순으로 정렬2
				//int tmp = 0;
				
				for(int i=0; i<rank.length-1; i++) {
					for(int j=i+1; j<rank.length; j++) {
						if(rank[j] < rank[i]) {
							tmp = rank[i];
							rank[i] = rank[j];
							rank[j] = tmp;
						}
					}
				}
			for(int i=0; i<rank.length; i++) {
			System.out.print(rank[i] + "등");
			}
		*/
		
		//자리변경을 위한 임시배열필요
		int[] tmp = new int[5]; //선생님이 해준거		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] < arr[j][4]) {
					tmp= arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		//출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j==3) {
					System.out.print((char)(arr[i][j])+"\t");
				}else {
					System.out.print(arr[i][j]+"\t");
				}		
			}
			System.out.println();
		}
	}
		
		
		
		
		
		/*
		arr[0][2] = 270; 
		arr[1][2] = 210; 
		arr[2][2] = 180; 
		arr[3][2] = 300; 
		arr[4][2] = 280; 
		 */

		
		/*
		k1[0] = arr[0][2];
		k1[1] = arr[1][2];
		k1[2] = arr[2][2];
		k1[3] = arr[3][2];
		k1[4] = arr[4][2];
		System.out.println("k는"+k1[0]);
		*/
		
		

		

	/*	// 출력
		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
					}
			System.out.println(arr[i][2]);
				}
		
		int sum = (arr[i][2]);
		
		
		
		for (int j = 0; j < sum; i++) {
			for (int p = 0; p < sum; p++) {
				if(j == p) continue;
			//	if(sum[j] < sum[p]) {
					rank[j]++;
				}
			}
		}		
		System.out.println(rank[i]);
	*/
		//순위로 오름차순해서 정렬
		//arr [0][0];
		
		//출력
		
		
//내일 저녁까지
		
		//스캐너-국영수
	}
}
