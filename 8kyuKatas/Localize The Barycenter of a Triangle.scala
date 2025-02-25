/*
The medians of a triangle are the segments that unit the vertices with the midpoint of their opposite sides. The three medians of a triangle intersect at the same point, called the barycenter or the centroid. Given a triangle, defined by the cartesian coordinates of its vertices, we need to localize its barycenter or centroid.
Your function receives the coordinates of the three vertices A, B and C  as three different arguments and outputs the coordinates of the barycenter O, rounded to 4 decimals, in an array [xO, yO].
You know that the coordinates of the barycenter are given by the following formulas:

The given points form a real or a degenerate triangle but in each case the above formulas can be used.
For additional information about this important point of a triangle see at: (https://en.wikipedia.org/wiki/Centroid)
Let's see some cases:
([4, 6], [12, 4], [10, 10]) ------> [8.6667, 6.6667]
([4, 2], [12, 2], [6, 10]) ------> [7.3333, 4.6667]
Enjoy it and happy coding!!
*/

def barTriang(pointA: (Int, Int), pointB: (Int, Int), pointC: (Int, Int)): (Double, Double) = {
  val centroidX = (pointA._1 + pointB._1 + pointC._1) / 3.0
  val centroidY = (pointA._2 + pointB._2 + pointC._2) / 3.0
  
  (
    BigDecimal(centroidX).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble,
    BigDecimal(centroidY).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble
  )
}
