class Solution {
fun solution(dots: Array<IntArray>): Int {
    val dot0 = dots[0]
    val dot1 = dots[1]
    val dot2 = dots[2]
    val dot3 = dots[3]

    //(y2-y1)/(x2-x1) == (y4-y3)/(x4-x3)

    //(y2-y1)*(x4-x3) == (y4-y3)*(x2-x1)

    //0-1 과 2-3
    val result1 =(dot0[1]-dot1[1]) * (dot2[0]-dot3[0]) == (dot2[1]-dot3[1]) * (dot0[0]-dot1[0])
    if (result1) return 1

    //0-2 과 1-3
    val result2 =(dot0[1]-dot2[1]) * (dot1[0]-dot3[0]) == (dot1[1]-dot3[1]) * (dot0[0]-dot2[0])
    if (result2) return 1

    //0-3 과 1-2
    val result3 =(dot0[1]-dot3[1]) * (dot1[0]-dot2[0]) == (dot1[1]-dot2[1]) * (dot0[0]-dot3[0])
    if (result3) return 1


    return 0
}

}