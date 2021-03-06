// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package torch.torch

sealed abstract class ProtoVersion(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
  type EnumType = ProtoVersion
  def isProtoVersionNewest: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[ProtoVersion] = torch.torch.ProtoVersion
  final def asRecognized: _root_.scala.Option[torch.torch.ProtoVersion.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[torch.torch.ProtoVersion.Recognized])
}

object ProtoVersion extends _root_.scalapb.GeneratedEnumCompanion[ProtoVersion] {
  sealed trait Recognized extends ProtoVersion
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[ProtoVersion] = this
  @SerialVersionUID(0L)
  case object PROTO_VERSION_NEWEST extends ProtoVersion(6) with ProtoVersion.Recognized {
    val index = 0
    val name = "PROTO_VERSION_NEWEST"
    override def isProtoVersionNewest: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends ProtoVersion(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.immutable.Seq(PROTO_VERSION_NEWEST)
  def fromValue(__value: _root_.scala.Int): ProtoVersion = __value match {
    case 6 => PROTO_VERSION_NEWEST
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = TorchProto.javaDescriptor.getEnumTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = TorchProto.scalaDescriptor.enums(0)
}