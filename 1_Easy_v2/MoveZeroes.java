public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0) return;

        int cnt =0;
        int ptr=0;

        for(int i=0; i<nums.length; i++){
        	if(nums[i]==0){
        		cnt++;
        	}else{
        		nums[ptr++]=nums[i];
        	}
        }

        for(int i=nums.length-cnt; i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args){

    }

    public void test1(){

    }
}