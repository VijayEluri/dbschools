package com.dbschools.mgb.schema

import org.squeryl.Schema
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.dsl.ast.{FunctionNode, EqualityExpression}
import org.squeryl.Schema

object AppSchema extends Schema {
  val musicians       = table[Musician]("musician")
  val groups          = table[Group]("music_group")
  val musicianGroups  = table[MusicianGroup]("musician_group")
  val instruments     = table[Instrument]("instrument")
}
