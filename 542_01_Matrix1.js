//https://leetcode.com/problems/01-matrix/description/
//DP
var updateMatrix = function(mat) {
    const m = mat.length;
    if(m === 0) return mat;
    const n = mat[0].length;
    const dist = Array.from({length: m}, () => Array.from({length: n}, () => Number.MAX_SAFE_INTEGER));

    //첫번째 반복
    for(let i = 0; i < m; i++){
        for(let j = 0; j < n; j++){
            if(mat[i][j] === 0) dist[i][j] = 0;
            else{
                if(i > 0) dist[i][j] = Math.min(dist[i][j], dist[i-1][j] + 1);
                if(j > 0) dist[i][j] = Math.min(dist[i][j], dist[i][j-1] + 1);
            }
        }
    }

    //두번째 반복
    for(let i = m-1; i >= 0; i--){
        for(let j = n-1; j >= 0; j--){
            if(i < m-1) dist[i][j] = Math.min(dist[i][j], dist[i+1][j] + 1);
            if(j < n-1) dist[i][j] = Math.min(dist[i][j], dist[i][j+1] + 1);
        }
    }
    return dist;
};