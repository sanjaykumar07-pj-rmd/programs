class Solution {
    public int diff[][]={{-1,0},{0,-1},{0,1},{1,0}};
    public void dp(char[][] ar,int r,int c,int ro,int co){
        if(ar[r][c]=='1'){
        ar[r][c]='0';
        for(int i=0;i<4;i++){
            int row=r+diff[i][0], col=c+diff[i][1];
            if(row>-1 && row<ro && col>-1 && col<co){
                dp(ar,row,col,ro,co);
            }
        }
        }
    }
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length,islands=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dp(grid,i,j,r,c);
                }
            }
        }
        return islands;
    }
}