package edu.caeus.treadmill

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import edu.caeus.treadmill.backend.Talehub
import edu.caeus.treadmill.backend.data.SignedUser

object Routes {


  def paths(talehub: Talehub): List[Route] = List(
    (post & path("v1" / "users" / "$new")) {


      ???
    },
    (post & path("v1" / "users" / "$auth")) {
      ???
    },
    (post & path("v1" / "sheets" / "$set")) {
      ???
    },
    (get & path("v1" / "sheets" / "$refs")) {
      ???
    },
    (get & path("v1" / "sheets" / Segment / "$res")) {
      sheetId =>
        ???
    },
    (post & path("v1" / "sheets" / Segment / "ops" / "$submit")) {
      sheetId =>
        ???
    },
    (get & path("v1" / "sheets" / Segment / "ops" / "$refs")) {
      (sheetId) =>
        ???
    },
    (get & path("v1" / "sheets" / Segment / "ops" / Segment / "$res")) {
      (sheetId, opId) =>
        ???
    }
  )

  def apply(talehub: Talehub): Route = {
    paths(talehub) match {
      case head :: tail => tail.foldLeft(head)(_ ~ _)
      case Nil => throw new IllegalStateException("No routes exist, why?")
    }
  }

}
