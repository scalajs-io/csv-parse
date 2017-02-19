package io.scalajs.npm.csvparse

import io.scalajs.nodejs.stream.{Readable, Writable}

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * CSV Parser
  * @author lawrence.daniels@gmail.com
  */
@js.native
class Parser(val options: ParserOptions) extends Readable with Writable {

  /**
    * Undocumented method
    * @see https://github.com/nodejs/node-v0.x-archive/blob/cfcb1de130867197cbc9c6012b7e84e08e53d032/lib/fs.js#L1597-L1620
    */
  override def close(callback: js.Function = js.native): Unit = js.native

  /**
    * Internal counter of records being processed.
    */
  def count: Int = js.native

  /**
    * The number of lines encountered in the source dataset.
    */
  def lines: Int = js.native

  /**
    * The regular expression or function used to determine if a value should be cast to an integer.
    * @param expr the given regular expression or function
    * @return true, if a value should be cast to an integer.
    */
  def is_int(expr: js.RegExp | js.Function): Boolean = js.native

  /**
    * The regular expression or function used to determine if a value should be cast to a float.
    * @param expr the given regular expression or function
    * @return true, if a value should be cast to a float
    */
  def is_float(expr: js.RegExp | js.Function): Boolean = js.native

}
