import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

val conf = new SparkConf()
  .setAppName("Test Spark App")
  .setMaster("local[4]")
val sc = new SparkContext(conf)
