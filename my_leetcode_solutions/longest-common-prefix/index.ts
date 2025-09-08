function longestCommonPrefix(strs: string[]): string {
  let lcp: string = strs[0];
  for (let i = 1; i < strs.length; i++) {
    while (lcp.length && !strs[i].startsWith(lcp)) {
      lcp = lcp.slice(0, -1);
    }
    if (lcp === "") return "";
  }
  return lcp;
}
const testCase1 = ["flower", "flow", "flight"];
const testCase2 = ["reflower", "flow", "flight"];

console.log("Test Case 1 Result :" + longestCommonPrefix(testCase1));
console.log("--------------------");
console.log("Test Case 2 Reulst :" + longestCommonPrefix(testCase2));
