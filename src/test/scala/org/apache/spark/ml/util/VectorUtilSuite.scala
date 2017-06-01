package org.apache.spark.ml.util

import org.apache.spark.ml.SparkMLFunSuite
import org.apache.spark.ml.utils.VectorUtil

/**
  * Created by shuangfu on 17-5-5.
  * Author : DRUNK
  * email :len1988.zhang@gmail.com
  */
class VectorUtilSuite extends SparkMLFunSuite {

  test("test 欧式距离") {
    val a = Array(-1d, 2d)
    val b = Array(-2d, 4d)
    val c = Array(-1d, 2d)
    //println(VectorUtil.getDistance(a, b))
    //assert(VectorUtil.getDistance(a, b) === 0d)

    //println(VectorUtil.getDistance(a))
    //println(VectorUtil.getDistance(b))
    //println(VectorUtil.getCosine(a))
    //println(VectorUtil.getCosine(b))

    val vs = "0.186183,-5.289174,-5.34678,-8.131892,-2.954744,3.108071,1.906767,2.220295,4.573383,-6.508241,5.979468,-3.543776,0.779526,6.610768,-1.069095,4.033268,0.510468,2.532704,-0.072547,2.726134,2.56986,-2.700435,0.929231,-7.722867,-3.075469,2.742209,1.924524,-0.529341,-1.414915,-0.591052,0.573074,-0.012778,1.248015,-2.035022,1.953265,1.852828,-2.813729,3.750608,1.65482,-3.742335,-1.00164,-1.638855,-0.068561,-0.058064,2.725989,-3.780564,-4.513888,-1.14901,3.161036,2.313982,2.606509,-1.582976,5.929494,-3.051471,-1.622451,-0.360815,-0.171715,-9.505555,-0.62838,-1.554575,0.104802,-1.025134,-2.721193,3.714087,-0.222891,1.75799,0.879138,-4.991982,1.89079,-3.103349,3.723216,7.818713,1.305843,-1.929096,0.948465,2.460762,-4.602787,-1.584264,-2.946482,-2.609926,2.984264,-7.022888,-3.886632,-2.213383,0.401315,1.169582,-2.290226,0.50583,1.449717,-2.260453,2.090669,0.731321,3.994117,-1.578526,-3.818593,2.897109,3.590932,0.262162,-0.901601,5.100477"
    val vs2 = "0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0"
    val vectors = if (vs.indexOf(",") > 0) vs.split(",").map(_.toDouble) else Array[Double]()
    val vectors2 = if (vs2.indexOf(",") > 0) vs2.split(",").map(_.toDouble) else Array[Double]()
    println(vectors.isEmpty)
    println(VectorUtil.getCosine(vectors, vectors2))

  }

}