/**
 * @param {number[][]} isConnected
 * @return {number}
 */

// BFS
var findCircleNum = function(isConnected) {
    const V = isConnected.length;
    const visited = Array(V).fill(false);
    const queue = [];

    let count = 0;

    function bfs(u) {
        queue.push(u);
        visited[u] = true;

        let front = 0;
        while(front < queue.length){
            const u = queue[front++];
            for(let v = 0; v < V; v++){
                if(!visited[v] && isConnected[u][v]){
                    visited[v] = true;
                    queue.push(v);
                }
            }
        }
    }

    for(let i = 0; i < V; i++){
        if(!visited[i]){
            count++;
            bfs(i);
        }
    }

    return count;
};