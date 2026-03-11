/**
 * @param {number[][]} isConnected
 * @return {number}
 */

// DFS
var findCircleNum = function(isConnected) {
    const V = isConnected.length;
    const visited = Array(V).fill(false);
    let count = 0;

    function dfs(u) {
        visited[u] = true;

        for(let v = 0; v < V; v++){
            if(!visited[v] && isConnected[u][v]){
                visited[v] = true;
                dfs(v);
            }
        }
    }

    for(let i = 0; i < V; i++){
        if(!visited[i]){
            count++;
            dfs(i);
        }
    }

    return count;
};