class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Al=new ArrayList<List<Integer>>();
        for(int n=0;n<numRows;n++){
            List<Integer> A=new ArrayList<>();
            int nCr=1;
            A.add(nCr);
            for(int r=0;r<n;r++){
                nCr=((n-r)*nCr)/(r+1);
                A.add(nCr);
            }
            Al.add(A);
        }
        return Al;
    }
}
