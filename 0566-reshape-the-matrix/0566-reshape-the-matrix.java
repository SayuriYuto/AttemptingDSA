class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c) return mat;
        int [][]ans = new int[r][c];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                arr.add(mat[i][j]);
            }
        }
        int count = 0;
        for(int i =0;i<r;i++){
            for(int j = 0;j<c;j++){
                ans[i][j] = arr.get(count++);
            }
        }
        System.out.println(arr);
        return ans;
    }
}