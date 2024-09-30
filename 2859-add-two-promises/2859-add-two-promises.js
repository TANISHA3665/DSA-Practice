/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {

   const sum = promise1.then((value1) =>{
       return promise2.then((value2) => {
    return value1 + value2;
    });
   });

   return new Promise((resolve, reject) => {
    resolve(sum);
   })

};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */