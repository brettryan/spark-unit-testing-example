
package com.drunkendev

import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ApplicationTest extends FunSuite {

  test("Create a spark context") {
    val conf: SparkConf = new SparkConf()
      .setAppName("NBA - Mosh Pit - Delta Engine")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)
  }

}

