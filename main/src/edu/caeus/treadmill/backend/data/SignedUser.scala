package edu.caeus.treadmill.backend.data

case class SignedUser(user: User,
                      signature: UserSignature)