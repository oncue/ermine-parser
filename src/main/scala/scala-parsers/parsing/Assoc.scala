package scala-parsers.parsing

sealed trait Assoc
case object AssocL extends Assoc
case object AssocR extends Assoc
case object AssocN extends Assoc
