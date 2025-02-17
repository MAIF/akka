/*
 * Copyright (C) 2009-2023 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.compat

import scala.annotation.nowarn

import akka.annotation.InternalApi

/**
 * INTERNAL API
 *
 * Compatibility wrapper for `scala.PartialFunction` to be able to compile the same code
 * against Scala 2.12, 2.13, 3.0
 *
 * Remove these classes as soon as support for Scala 2.12 is dropped!
 */
@InternalApi private[akka] object PartialFunction {

  def fromFunction[A, B](f: (A) => B): scala.PartialFunction[A, B] = {
    @nowarn val pf = scala.PartialFunction(f)
    pf
  }

}
