//A Promise in JavaScript is used to handle asynchronous operations. It represents a value that might be available now, in the future, or never.



// Promise is a object representing the eventual completion/failure of a asynchronous operation
/*

✅ States of a Promise

Pending → Initial state, neither fulfilled nor rejected.
Fulfilled → Operation completed successfully.
Rejected → Operation failed.

✅ Methods to Handle Promises:

.then(successCallback) → Runs when the promise is resolved.
.catch(errorCallback) → Runs when the promise is rejected.
.finally(finalCallback) → Runs regardless of the outcome.


const myPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
        let success = true;
        if (success) {
            resolve("✅ Operation successful!");
        } else {
            reject("❌ Operation failed!");
        }
    }, 2000);
});

// Handling the Promise
myPromise
    .then(result => console.log(result))   // If resolved
    .catch(error => console.log(error))    // If rejected
    .finally(() => console.log("Promise Completed"));

    🔴 Example 4: Promise.all() - Run Multiple Promises in Parallel
👉 Waits for all promises to resolve or rejects if any fail.


const promise1 = new Promise(resolve => setTimeout(() => resolve("✅ Task 1"), 2000));
const promise2 = new Promise(resolve => setTimeout(() => resolve("✅ Task 2"), 1000));
const promise3 = new Promise(resolve => setTimeout(() => resolve("✅ Task 3"), 1500));

Promise.all([promise1, promise2, promise3])
    .then(results => console.log(results))  // ✅ All resolved
    .catch(error => console.log("❌ One failed: ", error));

    🟠 Example 5: Promise.race() - First Resolved Promise Wins
    👉 Returns the first resolved/rejected promise.
    
    javascript
    Copy
    Edit
    const fastPromise = new Promise(resolve => setTimeout(() => resolve("🚀 Fastest"), 1000));
    const slowPromise = new Promise(resolve => setTimeout(() => resolve("🐢 Slow"), 3000));
    
    Promise.race([fastPromise, slowPromise])
        .then(result => console.log(result)); // 🚀 Fastest (since it resolves in 1 


        🟠 Example 5: Promise.race() - First Resolved Promise Wins
👉 Returns the first resolved/rejected promise.

javascript
Copy
Edit
const fastPromise = new Promise(resolve => setTimeout(() => resolve("🚀 Fastest"), 1000));
const slowPromise = new Promise(resolve => setTimeout(() => resolve("🐢 Slow"), 3000));

Promise.race([fastPromise, slowPromise])
    .then(result => console.log(result)); // 🚀 Fastest (since it resolves in 1 */