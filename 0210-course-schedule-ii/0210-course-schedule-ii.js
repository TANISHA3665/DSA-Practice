/**
 * @param {number} numCourses
 * @param {number[][]} prerequisites
 * @return {number[]}
 */
var findOrder = function(numCourses, prerequisites) {
    
    // Convert to adj list
    const adj = Array.from({length: numCourses}, () => []);

    for(let [v, u] of prerequisites){
        adj[u].push(v);
    }

    // 1. Indegree
    const indegree = Array(numCourses).fill(0);

    for(let u = 0; u < numCourses; u++){
        for(let v of adj[u]){
            indegree[v]++;
        }
    }

    // 2. Insert in queue indegree of 0

    const queue = [];
    const result = [];

    for(let i = 0; i < numCourses; i++){
        if(indegree[i] == 0){
            queue.push(i);
        }
    }

    // 3. BFS

    let front = 0;

    while(front < queue.length){
        const u = queue[front++];
        result.push(u);

        for(let v of adj[u]){
            indegree[v]--;

            if(indegree[v] == 0){
                queue.push(v);
            }
        }
    }

    if(result.length == numCourses){
        return result;
    }

    return [];
};