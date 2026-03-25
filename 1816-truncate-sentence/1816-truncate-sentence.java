class Solution {
    public String truncateSentence(String s, int k) {

        StringBuilder sb = new StringBuilder();
        String arr[] = s.split("\\s+");
        for(int i=0;i<k;i++){
            sb.append(arr[i]+" ");
        }
        return sb.toString().trim();
    }
}
