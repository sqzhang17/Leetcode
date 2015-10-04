public class Solution{
	public int frogJump(int[] a, int len, int perJump){
		if(perJump>=len) return 0;

		boolean[] hasLeaf = new boolean[len];

		int earliest =-1;
		int farest = perJump;

		for(int i=0;i<a.length;i++){
			int currTime = i;
			int currLeafPos = a[i];

			if(hasLeaf[currLeafPos]) continue;

			hasLeaf[currLeafPos]=true;

			if(farest<currLeafPos) continue;

			int jumpCnt=1;

			while(jumpCnt<=perJump){
				//System.out.print(currLeafPos+", "+jumpCnt);
				//sop(hasLeaf);
				//System.out.println(currLeafPos+jumpCnt+",");
				if(currLeafPos+jumpCnt>=len) return currTime;

				if(hasLeaf[currLeafPos+jumpCnt]){
					currLeafPos=currLeafPos+jumpCnt;
					jumpCnt=1;
				}else{
					farest=Math.max(farest,currLeafPos+jumpCnt);
					jumpCnt++;
				}
			}
		}
		return earliest;
	}

	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();
		s.test3();
	}

	public void test1(){
		int[] a = {1,3,1,4,2,5};
		System.out.println(frogJump(a,7,3));
	}
	public void test2(){
		int[] a = {4,2};
		System.out.println(frogJump(a,6,2));
	}
	public void test3(){
		int[] a = {1,4,2};
		System.out.println(frogJump(a,6,2));
	}

	public void sop(int[] a){
		System.out.print("[");
		for(int i:a){
			System.out.print(i+",");
		}
		System.out.print("]");
		System.out.println();
	}

	public void sop(boolean[] a){
		System.out.print("[");
		for(boolean i:a){
			System.out.print(i+",");
		}
		System.out.print("]");
		System.out.println();

	}
}