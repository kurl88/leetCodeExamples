package com.leetCode.scala

import java.util
import java.util.HashMap

import scala.collection.mutable

/**
  * Created by mengfl on 2019/2/2.
  */
object TwoSum {
  def twoSum3(nums: Array[Int], target: Int): Array[Int] = {
    val a: mutable.Map[Int, Int] = mutable.HashMap()
    for (i <- nums.indices) {
      val x = target - nums(i)
      if (a.contains(x)) {
        println("a.get(x).toString.toInt=" + a(x) + ",i=" + i)
        return Array(a(x), i)
      }
      a.put(nums(i), i)
    }
Array(-1,-1)
}

  def main(args: Array[String]): Unit = {

    twoSum3(Array(2, 7, 11, 15), 9)
    assert(twoSum3(Array(2, 7, 11, 15), 9).sameElements(Array(0, 1)))
  }

}