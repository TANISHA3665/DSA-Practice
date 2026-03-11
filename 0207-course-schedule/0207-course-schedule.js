/**
 * @param {number} numCourses
 * @param {number[][]} prerequisites
 * @return {boolean}
 */
 // DFS
var canFinish = function(numCourses, prerequisites) {
    function DFS(u) {
        visited[u] = true;
        inRecursionStack[u] = true;

        for(let v of adj[u]){
            if(!visited[v] && !DFS(v)){
                return false;
            }

            else if(inRecursionStack[v]){
                return false;
            }
        }

        inRecursionStack[u] = false;
        return true;
    }
    const adj = Array.from({length: numCourses}, () => []);

    for(let [v, u] of prerequisites){
        adj[u].push(v);
    }

    const visited = Array(numCourses).fill(false);
    const inRecursionStack = Array(numCourses).fill(false);

    for(let i = 0; i < numCourses; i++){
        if(!visited[i] && !DFS(i)){
            return false;
        }
    }

    return true;
};