package leetCode75

import java.util.*


internal class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val mappingDictStoT = IntArray(256)
        Arrays.fill(mappingDictStoT, -1)
        val mappingDictTtoS = IntArray(256)
        Arrays.fill(mappingDictTtoS, -1)
        for (i in s.indices) {
            val c1 = s[i]
            val c2 = t[i]

            // Case 1: No mapping exists in either of the dictionaries
            if (mappingDictStoT[c1.toInt()] == -1 && mappingDictTtoS[c2.toInt()] == -1) {
                mappingDictStoT[c1.toInt()] = c2.toInt()
                mappingDictTtoS[c2.toInt()] = c1.toInt()
            } else if (!(mappingDictStoT[c1.toInt()].toChar() == c2
                        && mappingDictTtoS[c2.toInt()].toChar() == c1)) {
                return false
            }
        }
        return true
    }
}