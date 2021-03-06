// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package caffe2.caffe2

/** @param name
  *   All the networks that are used in this execution. Note that networks should
  *   be ordered in the way they are executed, i.e. for a layer in a network, all
  *   its input blobs should already have been initialized by the layers or
  *   networks defined before it.
  * @param network
  *   The networks that are going to be used in this plan.
  */
@SerialVersionUID(0L)
final case class PlanDef(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    network: _root_.scala.Seq[caffe2.caffe2.NetDef] = _root_.scala.Seq.empty,
    executionStep: _root_.scala.Seq[caffe2.caffe2.ExecutionStep] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[PlanDef] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      network.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      executionStep.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      name.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      network.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      executionStep.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: PlanDef = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): PlanDef = copy(name = Option(__v))
    def clearNetwork = copy(network = _root_.scala.Seq.empty)
    def addNetwork(__vs: caffe2.caffe2.NetDef*): PlanDef = addAllNetwork(__vs)
    def addAllNetwork(__vs: Iterable[caffe2.caffe2.NetDef]): PlanDef = copy(network = network ++ __vs)
    def withNetwork(__v: _root_.scala.Seq[caffe2.caffe2.NetDef]): PlanDef = copy(network = __v)
    def clearExecutionStep = copy(executionStep = _root_.scala.Seq.empty)
    def addExecutionStep(__vs: caffe2.caffe2.ExecutionStep*): PlanDef = addAllExecutionStep(__vs)
    def addAllExecutionStep(__vs: Iterable[caffe2.caffe2.ExecutionStep]): PlanDef = copy(executionStep = executionStep ++ __vs)
    def withExecutionStep(__v: _root_.scala.Seq[caffe2.caffe2.ExecutionStep]): PlanDef = copy(executionStep = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => network
        case 3 => executionStep
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(network.iterator.map(_.toPMessage).toVector)
        case 3 => _root_.scalapb.descriptors.PRepeated(executionStep.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = caffe2.caffe2.PlanDef
    // @@protoc_insertion_point(GeneratedMessage[caffe2.PlanDef])
}

object PlanDef extends scalapb.GeneratedMessageCompanion[caffe2.caffe2.PlanDef] with scalapb.HasBuilder[caffe2.caffe2.PlanDef] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[caffe2.caffe2.PlanDef] with scalapb.HasBuilder[caffe2.caffe2.PlanDef] = this
  def merge(`_message__`: caffe2.caffe2.PlanDef, `_input__`: _root_.com.google.protobuf.CodedInputStream): caffe2.caffe2.PlanDef = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[caffe2.caffe2.PlanDef] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      caffe2.caffe2.PlanDef(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        network = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[caffe2.caffe2.NetDef]]).getOrElse(_root_.scala.Seq.empty),
        executionStep = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[caffe2.caffe2.ExecutionStep]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = Caffe2Proto.javaDescriptor.getMessageTypes().get(17)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = Caffe2Proto.scalaDescriptor.messages(17)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = caffe2.caffe2.NetDef
      case 3 => __out = caffe2.caffe2.ExecutionStep
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = caffe2.caffe2.PlanDef(
    name = _root_.scala.None,
    network = _root_.scala.Seq.empty,
    executionStep = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __name: _root_.scala.Option[_root_.scala.Predef.String],
    private val __network: _root_.scala.collection.immutable.VectorBuilder[caffe2.caffe2.NetDef],
    private val __executionStep: _root_.scala.collection.immutable.VectorBuilder[caffe2.caffe2.ExecutionStep],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[caffe2.caffe2.PlanDef] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Option(_input__.readStringRequireUtf8())
          case 18 =>
            __network += _root_.scalapb.LiteParser.readMessage[caffe2.caffe2.NetDef](_input__)
          case 26 =>
            __executionStep += _root_.scalapb.LiteParser.readMessage[caffe2.caffe2.ExecutionStep](_input__)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): caffe2.caffe2.PlanDef = {
      caffe2.caffe2.PlanDef(
        name = __name,
        network = __network.result(),
        executionStep = __executionStep.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[caffe2.caffe2.PlanDef, caffe2.caffe2.PlanDef.Builder] {
    def apply(): Builder = new Builder(
      __name = _root_.scala.None,
      __network = new _root_.scala.collection.immutable.VectorBuilder[caffe2.caffe2.NetDef],
      __executionStep = new _root_.scala.collection.immutable.VectorBuilder[caffe2.caffe2.ExecutionStep],
      `_unknownFields__` = null
    )
    def apply(`_message__`: caffe2.caffe2.PlanDef): Builder = new Builder(
        __name = _message__.name,
        __network = new _root_.scala.collection.immutable.VectorBuilder[caffe2.caffe2.NetDef] ++= _message__.network,
        __executionStep = new _root_.scala.collection.immutable.VectorBuilder[caffe2.caffe2.ExecutionStep] ++= _message__.executionStep,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = caffe2.caffe2.PlanDef.Builder()
  def newBuilder(`_message__`: caffe2.caffe2.PlanDef): Builder = caffe2.caffe2.PlanDef.Builder(_message__)
  implicit class PlanDefLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, caffe2.caffe2.PlanDef]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, caffe2.caffe2.PlanDef](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def network: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[caffe2.caffe2.NetDef]] = field(_.network)((c_, f_) => c_.copy(network = f_))
    def executionStep: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[caffe2.caffe2.ExecutionStep]] = field(_.executionStep)((c_, f_) => c_.copy(executionStep = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val NETWORK_FIELD_NUMBER = 2
  final val EXECUTION_STEP_FIELD_NUMBER = 3
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    network: _root_.scala.Seq[caffe2.caffe2.NetDef],
    executionStep: _root_.scala.Seq[caffe2.caffe2.ExecutionStep]
  ): _root_.caffe2.caffe2.PlanDef = _root_.caffe2.caffe2.PlanDef(
    name,
    network,
    executionStep
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[caffe2.PlanDef])
}
