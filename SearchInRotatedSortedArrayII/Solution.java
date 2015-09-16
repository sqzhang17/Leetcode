public class Solution {
    public boolean search(int[] A, int target) {
        int l = 0;
        int r = A.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(A[mid] == target)
                return true;
            else if(A[mid] < A[l]){
                if(target > A[r])
                    r = mid - 1;
                else if(target < A[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }else if(A[mid] > A[l]){
                if(target < A[mid] && target >= A[l])
                    r = mid - 1;
                else
                    l = mid + 1;
            }else{ // A[mid] == A[l]
                if(A[mid] != A[r])
                    l = mid + 1;
                else{
                    boolean flag = true;
                    for(int k = 1; mid - k >= l && mid + k <= r; k++){
                        if(A[mid] != A[mid - k]){
                            r = mid - k;
                            flag = false;
                            break;
                        }else if(A[mid] != A[mid + k]){
                            l = mid + k;
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        return false;
                }
            }
        }
        return false;
    }


    public boolean search_v2(int[] A, int target){
        int lo =0, hi = A.length-1;
        int mid = 0;
        while(lo<hi){
              mid=(lo+hi)/2;
              if(A[mid]==target) return true;
              if(A[mid]>A[hi]){
                  if(A[mid]>target && A[lo] <= target) hi = mid;
                  else lo = mid + 1;
              }else if(A[mid] < A[hi]){
                  if(A[mid]<target && A[hi] >= target) lo = mid + 1;
                  else hi = mid;
              }else{
                  hi--;
              }

        }
        return A[lo] == target ? true : false;
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test1();
    }

    public void test1(){
    	int[] a={3,4,5,1,2};
    	int target = 2;
    	System.out.println(search(a,target));
    }
}