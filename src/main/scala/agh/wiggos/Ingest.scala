package agh
package agh.wiggos

object Ingest extends SparkSessionProvider {

  def main(args: Array[String]): Unit = {
    val path = args(0)
    spark.read.format("json").load(path)

  }
}
