/**
 * @param {number} numCourses
 * @param {number[][]} prerequisites
 * @return {boolean}
 */
 // Kahn's Algo
var canFinish = function(numCourses, prerequisites) {

    // Convert to adj list
    const adj = Array.from({length: numCourses}, () => []);

    for(const [v, u] of prerequisites){
        adj[u].push(v);
    }

    // 1. Calculate indegree
    const indegree = Array(numCourses).fill(0);

    for(let u = 0; u < numCourses; u++){
        for(let v of adj[u]){
            indegree[v]++;
        }
    }

    // 2. Push into queue with indegree 0
    const queue = [];

    for(let i = 0; i < numCourses; i++){
        if(indegree[i] == 0){
            queue.push(i);
        }
    }

    // 3. Simple BFS 

    let front = 0;
    let count = 0;

    while(front < queue.length){
        const u = queue[front++];
        count++;

        for(let v of adj[u]){
            indegree[v]--;

            if(indegree[v] == 0){
                queue.push(v);
            }
        }
    }

    return count == numCourses;
};