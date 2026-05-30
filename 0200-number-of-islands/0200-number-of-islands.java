class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int r=grid.length;
        int c=grid[0].length;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    bfs(grid,i,j);
                }
            }
        }
        
            return count;

    }
    void bfs(char[][] grid,int i,int j){
        int r=grid.length;
        int c=grid[0].length;
        if(i<0 || j<0 || i>=r || j>=c || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        bfs(grid,i+1,j);
        bfs(grid,i-1,j);
        bfs(grid,i,j+1);
        bfs(grid,i,j-1);
    }
}