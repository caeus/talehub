package edu.caeus.treadmill.backend

import edu.caeus.treadmill.backend.data.{Token, User, UserID, UserSignature}

import scala.concurrent.Future


class UsersKeeper {


  def signUp(user: User, signature: UserSignature): Future[User] = ???

  def verify(id: UserID, signature: UserSignature): Future[Token] = ???

  //this should be super fast
  def identify(token: Token): Future[UserID] = ???
}
